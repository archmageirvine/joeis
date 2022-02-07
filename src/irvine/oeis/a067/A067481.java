package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A067481 Powers of 3 with initial digit 3.
 * @author Sean A. Irvine
 */
public class A067481 extends A000244 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.toString().startsWith("3")) {
        return t;
      }
    }
  }
}
