package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039503 Odd numbers from A039500.
 * @author Sean A. Irvine
 */
public class A039503 extends A039500 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
