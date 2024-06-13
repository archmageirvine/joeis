package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070762 n for which floor((4/3)^n) is prime.
 * @author Sean A. Irvine
 */
public class A070762 extends Sequence1 {

  private int mN = 2;
  private Z mA = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      if (Z.ONE.shiftLeft(2L * mN).divide(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
