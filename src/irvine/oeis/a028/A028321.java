package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028321.
 * @author Sean A. Irvine
 */
public class A028321 extends A028323 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isEven()) {
        return t;
      }
    }
  }
}
