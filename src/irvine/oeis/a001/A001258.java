package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001258.
 * @author Sean A. Irvine
 */
public class A001258 implements Sequence {

  private final MemoryFactorial mFactorial = new MemoryFactorial();
  private int mN = 1;

  // This is actually A055314
  private Z r(final int n, final int k) {
    if (n == 1) {
      return k == 1 ? Z.ONE : Z.ZERO;
    }
    if (n == 2) {
      if (k == 2) {
        return Z.ONE;
      } else if (k > 2) {
        return Z.ZERO;
      }
    }
    return Stirling.secondKind(n - 2, n - k).multiply(mFactorial.factorial(n).divide(mFactorial.factorial(k)));
  }

  // This is actually A213262
  private Z rStar(final int n, final int k) {
    if (k == 2) {
      if (n <= 4) {
        return Z.ONE;
      } else {
        return mFactorial.factorial(n - 2).divide(2);
      }
    }
    if (k <= n - 2) {
      Z s = Z.ZERO;
      for (int i = 2; i <= n; ++i) {
        s = s.add(Binomial.binomial(n - i - 1, k - i).multiply(r(n - k, i)));
      }
      return s;
    }
    return k == n - 1 ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 2; k < mN; ++k) {
      s = s.add(rStar(mN, k));
    }
    return s;
  }
}
