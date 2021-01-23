package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028324 Elements to the right of the central elements of the 5-Pascal triangle A028313 that are not 1.
 * @author Sean A. Irvine
 */
public class A028324 extends A028323 {

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
