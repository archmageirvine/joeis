package irvine.math.series;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.q.QUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;

/**
 * General interface for representing a series.
 * A series is able to produce coefficients on demand.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public interface Series<E> {

  /**
   * Create a finite integer series from a list of coefficients.
   * @param coeffs coefficients
   * @return series
   */
  static Series<Z> create(final long... coeffs) {
    return new Series<>() {

      @Override
      public Z coeff(final int n) {
        return n < coeffs.length ? Z.valueOf(coeffs[n]) : Z.ZERO;
      }

      @Override
      public int bound() {
        return coeffs.length - 1;
      }
    };
  }

  /**
   * Create a finite integer series from a list of coefficients.
   * @param coeffs coefficients
   * @return series
   */
  static Series<Z> create(final Z... coeffs) {
    return new Series<>() {

      @Override
      public Z coeff(final int n) {
        return n < coeffs.length ? coeffs[n] : Z.ZERO;
      }

      @Override
      public int bound() {
        return coeffs.length - 1;
      }
    };
  }

  /**
   * Create a finite rational series from a list of coefficients.
   * @param coeffs coefficients
   * @return series
   */
  static Series<Q> create(final List<Q> coeffs) {
    return new Series<>() {

      @Override
      public Q coeff(final int n) {
        return n < coeffs.size() ? coeffs.get(n) : Q.ZERO;
      }

      @Override
      public int bound() {
        return coeffs.size() - 1;
      }
    };
  }

  /**
   * Create a finite rational series from a string polynomial.
   * @param polynomial string representation of the polynomial
   * @return series
   */
  static Series<Q> create(final String polynomial) {
    return create(QUtils.parsePolynomial(polynomial));
  }

  /**
   * Convert an integer series to a rational series.
   * @param series integer series
   * @return rational series
   */
  static Series<Q> toQ(final Series<Z> series) {
    return new Series<>() {
      @Override
      public Q coeff(final int n) {
        return new Q(series.coeff(n));
      }

      @Override
      public int bound() {
        return series.bound();
      }
    };
  }

  /**
   * Create a series backed by a directly accessible sequence.
   * @param sequence underlying sequence
   * @return series based on sequence
   */
  static Series<Q> create(final DirectSequence sequence) {
    return new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(final int n) {
        return new Q(sequence.a(n));
      }
    };
  }

  /**
   * Create a series backed by a sequence.
   * The offset of the underlying sequence is not considered.
   * @param sequence underlying sequence
   * @return series based on sequence
   */
  static Series<Q> create(final Sequence sequence) {
    final List<Z> seq = new ArrayList<>();
    return new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(final int n) {
        while (seq.size() <= n) {
          seq.add(sequence.next());
        }
        return new Q(seq.get(n));
      }
    };
  }

  /**
   * Return a coefficient of the series.
   * @param n coefficient number
   * @return the coefficient
   */
  E coeff(final int n);

  /**
   * Return an upper bound on the maximum nonzero term of the series.
   * Most users should ignore this method, it is only relevant for the
   * construction of series.
   * The value <code>Integer.MAX_VALUE</code> corresponds to an
   * infinite series.
   * It is always safe to use <code>Integer.MAX_VALUE</code> for this
   * value, but a smaller value can lead to more efficient computation.
   * @return upper bound on nonzero terms
   */
  int bound();
}
