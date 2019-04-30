package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015848 Numbers n such that <code>phi(n + 7) | sigma(n)</code> for n not congruent to <code>0 (mod 3)</code>.
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
