package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039681 Odd Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039681 extends A039672 {

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
