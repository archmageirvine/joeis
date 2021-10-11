package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051853.
 * @author Sean A. Irvine
 */
public class A051855 extends A000142 {

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.pow(4).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
