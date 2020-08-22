package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028286 Even elements to right of central elements in 4-Pascal triangle A028275.
 * @author Sean A. Irvine
 */
public class A028286 extends A028284 {

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
