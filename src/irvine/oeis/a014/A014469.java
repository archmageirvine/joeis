package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014469.
 * @author Sean A. Irvine
 */
public class A014469 extends A014467 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven()) {
        return t;
      }
    }
  }
}
