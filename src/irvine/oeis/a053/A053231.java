package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053231 extends A053230 {

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
