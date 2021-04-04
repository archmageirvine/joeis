package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023201;

/**
 * A046118.
 * @author Sean A. Irvine
 */
public class A046118 extends A023201 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(12).isProbablePrime() && !p.add(18).isProbablePrime()) {
        return p;
      }
    }
  }
}
