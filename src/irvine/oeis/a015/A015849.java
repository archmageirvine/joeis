package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015849 Numbers n such that phi(n <code>+ 9)</code> | <code>sigma(n)</code> for n not congruent to <code>0 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A015849 extends A015827 {

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
