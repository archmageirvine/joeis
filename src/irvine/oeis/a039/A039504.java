package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039504 Odd numbers from A039501.
 * @author Sean A. Irvine
 */
public class A039504 extends A039501 {

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
