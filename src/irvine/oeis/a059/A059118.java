package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a015.A015915;

/**
 * A059118 Composite solutions to sigma(x)+8 = sigma(x+8).
 * @author Sean A. Irvine
 */
public class A059118 extends A015915 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}
