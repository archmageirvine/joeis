package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063138 Composite numbers not divisible by 2, 3, 5 or 7 which in base 2 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063138 extends A063131 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(3) != 0 && t.mod(5) != 0 && t.mod(7) != 0) {
        return t;
      }
    }
  }
}
