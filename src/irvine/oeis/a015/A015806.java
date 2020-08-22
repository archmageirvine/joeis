package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015806 Numbers k not congruent to 0 (mod 3) such that phi(k) + 4 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015806 extends A015793 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(3) != 0) {
        return t;
      }
    }
  }
}
