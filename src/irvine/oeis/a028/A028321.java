package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028321 Even elements to the right of the central elements of the 5-Pascal triangle <code>A028313</code>.
 * @author Sean A. Irvine
 */
public class A028321 extends A028323 {

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
