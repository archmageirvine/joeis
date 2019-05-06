package irvine.oeis.a202;

import irvine.math.z.Z;
import irvine.oeis.a005.A005374;

/**
 * A202342.
 * @author Sean A. Irvine
 */
public class A202342 extends A005374 {

  private Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA)) {
        return t;
      }
    }
  }
}
