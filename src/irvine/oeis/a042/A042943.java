package irvine.oeis.a042;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A042943 Numbers k such that binomial(2^k, k) is divisible by binomial(2^k, 2).
 * @author Sean A. Irvine
 */
public class A042943 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 3) != 0) {
        final Z mod = Z.ONE.shiftLeft(mN).subtract(1).shiftLeft(mN - 1);
        if (Z.ZERO.equals(Binomial.binomial(Z.ONE.shiftLeft(mN), Z.valueOf(mN)).mod(mod))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
