package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028285 Elements to right of central elements in 4-Pascal triangle A028275 that are not 1.
 * @author Sean A. Irvine
 */
public class A028285 extends A028284 {

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
