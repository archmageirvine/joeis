package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a005.A005839;

/**
 * A071710.
 * @author Sean A. Irvine
 */
public class A071711 extends A005839 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.subtract(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}
