package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A007628 Reflectable emirps.
 * @author Sean A. Irvine
 */
public class A007628 extends A006567 {

  @Override
  public Z next() {
    while (true) {
      final Z emirp = super.next();
      if (emirp.toString().matches("[0138]*")) {
        return emirp;
      }
    }
  }
}
