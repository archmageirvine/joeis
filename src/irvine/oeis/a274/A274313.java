package irvine.oeis.a274;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A274313 Conjugacy classes of binary matrices that are squares.
 * @author Gregory Morse
 */
public class A274313 extends Sequence0 {

  private final List<Z> mTerms = new ArrayList<>();
  private final List<Z> mLog = new ArrayList<>();
  private final boolean mInvertible;

  protected A274313(final boolean invertible) {
    mInvertible = invertible;
  }

  /** Construct the sequence. */
  public A274313() {
    this(false);
  }

  private Z contribution(final int n, final int d) {
    final int k = n / d;
    // The product has factors 1/(1-2*x^d) for odd d and for 4 | d.
    Z sum = (d & 3) == 2 ? Z.ZERO : Z.valueOf(d).shiftLeft(k);
    if (mInvertible) {
      // Remove the factor at x: multiply by 1-x^d for even d,
      // and divide by 1+x^d for odd d.
      sum = (d & 1) == 0 || (k & 1) != 0 ? sum.subtract(d) : sum.add(d);
    }
    return sum;
  }

  @Override
  public Z next() {
    final int n = mTerms.size();
    if (n == 0) {
      mLog.add(Z.ZERO);
      mTerms.add(Z.ONE);
      return Z.ONE;
    }
    Z log = Z.ZERO;
    for (int d = 1; d <= n / d; ++d) {
      if (n % d == 0) {
        log = log.add(contribution(n, d));
        if (d != n / d) {
          log = log.add(contribution(n, n / d));
        }
      }
    }
    mLog.add(log);
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      sum = sum.add(mLog.get(j).multiply(mTerms.get(n - j)));
    }
    final Z term = sum.divide(n);
    mTerms.add(term);
    return term;
  }
}
