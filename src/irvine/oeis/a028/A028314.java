package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028314 Elements in the 5-Pascal triangle A028313 that are not 1.
 * @author Sean A. Irvine
 */
public class A028314 extends A028313 {

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
