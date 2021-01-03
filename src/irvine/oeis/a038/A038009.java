package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038009 Values of A038007 not ending in 6 or 8.
 * @author Sean A. Irvine
 */
public class A038009 extends A038007 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final long r = t.mod(10);
      if (r != 6 && r != 8) {
        return t;
      }
    }
  }
}
