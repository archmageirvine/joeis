package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069817 Smallest remainder of p+q modulo n, where p*q = n^2 - 1, 1 &lt; p &lt; n-1, or n if no such factorization exists.
 * @author Sean A. Irvine
 */
public class A069817 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 5) {
      return Z.valueOf(mN);
    }
    final Z n1 = Z.valueOf(mN - 1);
    final Z k = Z.valueOf(mN).square().subtract(1);
    long best = mN;
    for (final Z p : Jaguar.factor(k).divisorsSorted()) {
      if (p.equals(n1)) {
        return Z.valueOf(best);
      }
      if (!Z.ONE.equals(p)) {
        final long t = p.add(k.divide(p)).mod(mN);
        if (t < best) {
          best = t;
        }
      }
    }
    return Z.ZERO;
  }
}
