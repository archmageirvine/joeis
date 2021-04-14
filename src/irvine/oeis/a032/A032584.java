package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032584 Odd numbers which are neither prime nor lucky.
 * @author Sean A. Irvine
 */
public class A032584 extends A032583 {

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
