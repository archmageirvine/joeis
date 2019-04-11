package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015806 Numbers n not congruent to <code>0 (mod 3)</code> such that phi(n) <code>+ 4</code> | sigma(n).
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
