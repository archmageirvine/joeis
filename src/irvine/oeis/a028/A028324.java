package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028324.
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
