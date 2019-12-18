package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028273 Even elements to right of central elements in 3-Pascal triangle <code>A028262</code>.
 * @author Sean A. Irvine
 */
public class A028273 extends A028271 {

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
