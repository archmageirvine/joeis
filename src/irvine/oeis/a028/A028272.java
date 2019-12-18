package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028272 Elements to right of central elements in 3-Pascal triangle <code>A028262</code> that are not 1.
 * @author Sean A. Irvine
 */
public class A028272 extends A028271 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ONE.equals(t)) {
        return t;
      }
    }
  }
}
