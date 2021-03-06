package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028266 Even elements in 3-Pascal triangle A028262 (by row).
 * @author Sean A. Irvine
 */
public class A028266 extends A028262 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isEven()) {
        return t;
      }
    }
  }
}
