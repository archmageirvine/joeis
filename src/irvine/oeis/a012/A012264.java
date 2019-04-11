package irvine.oeis.a012;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012264 Number of real roots of <code>x - x^3/3! + x^5/5! - </code>... <code>+ (-1)^n*x^(2n+1)/(2n+1)!</code>.
 * @author Sean A. Irvine
 */
public class A012264 implements Sequence {

  // Apply Sturm's theorem

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private Polynomial<Q> mA = RING.x();

  static List<Polynomial<Q>> sturmList(final Polynomial<Q> p) {
    final ArrayList<Polynomial<Q>> sturm = new ArrayList<>();
    sturm.add(p);
    sturm.add(RING.diff(p));
    int n = 1;
    do {
      ++n;
      final Polynomial<Q> rem = RING.divideAndRemainder(sturm.get(n - 2), sturm.get(n - 1))[1];
      sturm.add(RING.negate(rem));
    } while (sturm.get(n).degree() > 0);
    return sturm;
  }

  private boolean isInfinityAtNegativeInfinity(final Polynomial<Q> p) {
    return ((p.degree() & 1) == 0) ^ (p.leadingCoeff().signum() == 1);
  }

  private boolean isInfinityAtInfinity(final Polynomial<Q> p) {
    return p.leadingCoeff().signum() == 1;
  }

  // We don't really need to store all the polynomials, it would suffice to record
  // the sign information as we go.  But it is clearer like this.

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(2L * mN + 1).multiply(2L * mN);
    mA = RING.signedAdd((mN & 1) == 0, mA, RING.monomial(new Q(Z.ONE, mF), 2 * mN + 1));
    final List<Polynomial<Q>> sturm = sturmList(mA);
    int posTransitions = 0;
    int negTransitions = 0;
    boolean pos = isInfinityAtInfinity(sturm.get(0));
    boolean neg = isInfinityAtNegativeInfinity(sturm.get(0));
    for (int k = 1; k < sturm.size(); ++k) {
      final boolean p = isInfinityAtInfinity(sturm.get(k));
      if (p != pos) {
        ++posTransitions;
      }
      pos = p;
      final boolean n = isInfinityAtNegativeInfinity(sturm.get(k));
      if (n != neg) {
        ++negTransitions;
      }
      neg = n;
    }
    return Z.valueOf(negTransitions - posTransitions);
  }

}
