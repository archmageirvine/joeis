package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028331 Elements to the right of the central elements of the even-Pascal triangle A028326 that are not 2.
 * @author Sean A. Irvine
 */
public class A028331 extends A028330 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return t;
      }
    }
  }
}
