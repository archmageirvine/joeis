package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039679 Palindromic and prime Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039679 extends A039674 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
