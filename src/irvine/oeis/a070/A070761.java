package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070761 Values of floor((4/3)^n) that are composite.
 * @author Sean A. Irvine
 */
public class A070761 extends Sequence1 {

  private int mN = 2;
  private Z mA = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      final Z t = Z.ONE.shiftLeft(2L * mN).divide(mA);
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}
