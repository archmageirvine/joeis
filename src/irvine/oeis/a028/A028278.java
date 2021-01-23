package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028278 Odd elements in 4-Pascal triangle A028275 (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A028278 extends A028276 {

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
