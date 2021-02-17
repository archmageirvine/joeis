package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039505 Odd numbers from A039502.
 * @author Sean A. Irvine
 */
public class A039505 extends A039502 {

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
