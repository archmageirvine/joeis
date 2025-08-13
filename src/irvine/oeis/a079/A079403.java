package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A079403 Let G(t) be the set of numbers between 2^(t-1) and 2^t-1, inclusive. There is a unique number a(t) in G(t) so that the denominator of the a(t)-th partial sum of the double harmonic series is divisible by smaller 2-powers than its neighbors.
 * @author Sean A. Irvine
 */
public class A079403 extends Sequence2 {

  private long mN = 0;

  private Z inverse(final Z t2, final long n, final Z mod) {
    final long g = Functions.GCD.l(t2, n);
    return t2.divide(g).modMultiply(Z.valueOf(n / g).modInverse(mod), mod);
  }

  @Override
  public Z next() {
    ++mN;
    long res = 0;
    final long bigT = mN + 1;
    final Z mod = Z.ONE.shiftLeft(2 * bigT);
    final Z t2 = Z.ONE.shiftLeft(bigT);
    Z psum = Z.ZERO;
    Z innerSum = Z.ZERO;
    for (int t = 1; t <= mN; ++t) {
      for (long n = 1L << t; n < 1L << (t + 1); ++n) {
        innerSum = innerSum.add(inverse(t2, n - 1, mod));
        psum = psum.add(innerSum.modMultiply(inverse(t2, n, mod), mod));
        if (psum.mod(Z.ONE.shiftLeft(2 * bigT - t + 1)).isZero()) {
          res = n;
        }
      }
    }
    return Z.valueOf(res);
  }
}
