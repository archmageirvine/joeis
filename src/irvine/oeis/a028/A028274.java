package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028274 Odd elements (greater than 1) to right of central elements in 3-Pascal triangle A028262.
 * @author Sean A. Irvine
 */
public class A028274 extends A028272 {

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
