package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028263 Elements in 3-Pascal triangle <code>A028262</code> (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A028263 extends A028262 {

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
