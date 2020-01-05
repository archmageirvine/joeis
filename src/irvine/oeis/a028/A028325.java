package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028325 Odd elements to the right of the central elements of the 5-Pascal triangle <code>A028313</code>.
 * @author Sean A. Irvine
 */
public class A028325 extends A028323 {

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
