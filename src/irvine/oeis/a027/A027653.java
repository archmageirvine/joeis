package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027653 Values of Zagier's function J_1(k) as k runs through the numbers -1, 0, 3, 4, 7, 8, ... which are == -1 or 0 mod 4.
 * @author Sean A. Irvine
 */
public class A027653 extends A027652 {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((mN & 3) <= 1) {
        return t;
      }
    }
  }
}
