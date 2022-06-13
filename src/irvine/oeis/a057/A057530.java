package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057530 n is odd and divisible by number of divisors of n and sum of digits of n.
 * @author Sean A. Irvine
 */
public class A057530 extends A057529 {

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
