package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028287 Odd elements to right of central elements in 4-Pascal triangle <code>A028275</code>.
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
