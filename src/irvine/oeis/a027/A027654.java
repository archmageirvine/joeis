package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027654 Zagier's function <code>-J_1(4*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A027654 extends A027652 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((mN & 3) == 0) {
        return t.negate();
      }
    }
  }
}
