package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015817.
 * @author Sean A. Irvine
 */
public class A015817 extends A015814 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(3) == 1) {
        return t;
      }
    }
  }
}
