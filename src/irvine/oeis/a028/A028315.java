package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028315 Odd elements in the 5-Pascal triangle A028313.
 * @author Sean A. Irvine
 */
public class A028315 extends A028313 {

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
