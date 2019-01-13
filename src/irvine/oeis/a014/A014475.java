package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014475.
 * @author Sean A. Irvine
 */
public class A014475 extends A014413 {

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
