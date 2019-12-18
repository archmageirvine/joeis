package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028265 Odd elements in 3-Pascal triangle <code>A028262</code> (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A028265 extends A028264 {

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
