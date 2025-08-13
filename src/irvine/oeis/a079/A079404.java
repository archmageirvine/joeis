package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A079404 Let G(n) be the set of numbers between 2^(n-1) and 2^n-1, inclusive. There is a unique number m(n) in G(n) so that the denominator of the m(n)-th partial sum of the double harmonic series is divisible by smaller 2-power than that of others in G(n). This power is defined to be a(n).
 * @author Sean A. Irvine
 */
public class A079404 extends Sequence2 {

  private long mN = 0;

  private Z mod(final Q n, final Z mod) {
    return n.num().modMultiply(n.den().modInverse(mod), mod);
  }

  @Override
  public Z next() {
    ++mN;
    int res = 0;
    Q psum = Q.ZERO;
    Q innerSum = Q.ZERO;
    for (int t = 1; t <= mN; ++t) {
      final Z s = Z.ONE.shiftLeft(2L * t + 1);
      for (long n = 1L << t; n < 1L << (t + 1); ++n) {
        innerSum = innerSum.add(new Q(1, n - 1));
        psum = psum.add(innerSum.divide(n));
        if (mod(psum, s).isZero()) {
          throw new RuntimeException("The conjecture that 2 never divides the numerators of partial sums of double harmonic series is wrong");
        }
        Z b = Z.ZERO;
        int counter = 2 * t;
        while (b.isZero()) {
          b = mod(psum.multiply(Z.ONE.shiftLeft(counter)), Z.TWO);
          --counter;
        }
        if (counter < t - 1) {
          res = counter + 1;
        }
      }
    }
    return Z.valueOf(res);
  }
}
