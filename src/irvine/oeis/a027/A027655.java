package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027655 Zagier's function J_1(4*n).
 * @author Sean A. Irvine
 */
public class A027655 extends A027652 {

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((mN & 3) == 1) {
        return t;
      }
    }
  }
}
