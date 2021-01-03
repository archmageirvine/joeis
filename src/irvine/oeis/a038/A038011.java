package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038011 Values of A038007 ending in 2.
 * @author Sean A. Irvine
 */
public class A038011 extends A038007 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) == 2) {
        return t;
      }
    }
  }
}
