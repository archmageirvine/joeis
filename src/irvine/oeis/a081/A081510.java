package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081510 Numbers k such that 1 + 2^k + 4^k + 6^k is prime.
 * @author Sean A. Irvine
 */
public class A081510 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(2L * ++mN).setBit(mN).add(Z.SIX.pow(mN)).setBit(0);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
