package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028276 Elements in 4-Pascal triangle <code>A028275</code> (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A028276 extends A028275 {

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
