package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028277 Odd elements in 4-Pascal triangle A028275 (by row).
 * @author Sean A. Irvine
 */
public class A028277 extends A028275 {

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
