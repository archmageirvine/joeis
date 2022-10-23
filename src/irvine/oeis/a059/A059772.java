package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A059772 Smallest prime p such that n is a solution mod p of x^2 = 2, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A059772 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    for (final Z p : Jaguar.factor(Z.valueOf(++mN).square().subtract(2)).toZArray()) {
      if (p.longValue() > mN) {
        return p;
      }
    }
    return Z.ZERO;
  }
}
