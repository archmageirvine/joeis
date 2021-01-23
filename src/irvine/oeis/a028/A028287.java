package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028287 Odd elements (greater than 1) to right of central elements in 4-Pascal triangle A028275.
 * @author Sean A. Irvine
 */
public class A028287 extends A028285 {

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
