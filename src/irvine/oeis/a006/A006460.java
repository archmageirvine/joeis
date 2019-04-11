package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a139.A139399;

/**
 * A006460 Image of n after <code>3k</code> iterates of `3x+1' map <code>(k</code> large).
 * @author Sean A. Irvine
 */
public class A006460 extends A139399 {

  @Override
  public Z next() {
    final long r = super.next().mod(3);
    if (mN.compareTo(Z.TWO) <= 0) {
      return mN;
    }
    return r == 0 ? Z.FOUR : Z.valueOf(r);
  }
}
