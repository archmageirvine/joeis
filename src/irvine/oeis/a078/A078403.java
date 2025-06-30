package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078396.
 * @author Sean A. Irvine
 */
public class A078403 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(Z.NINE).isProbablePrime()) {
        return p;
      }
    }
  }
}

