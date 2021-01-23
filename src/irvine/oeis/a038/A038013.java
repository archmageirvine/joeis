package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038013 Values of A038005 ending in 3.
 * @author Sean A. Irvine
 */
public class A038013 extends A038007 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) == 3) {
        return t;
      }
    }
  }
}
