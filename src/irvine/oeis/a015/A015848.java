package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015848 Numbers k such that phi(k + 7) | sigma(k) for k not congruent to 0 (mod 3).
 * @author Sean A. Irvine
 */
public class A015848 extends A015823 {

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
