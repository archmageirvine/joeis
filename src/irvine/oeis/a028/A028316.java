package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028316 Odd elements in the 5-Pascal triangle <code>A028313</code> that are not 1.
 * @author Sean A. Irvine
 */
public class A028316 extends A028314 {

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
