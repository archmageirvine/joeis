package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014461 Odd numbers in the triangle of Eulerian numbers that are not 1.
 * @author Sean A. Irvine
 */
public class A014461 extends A014459 {

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
