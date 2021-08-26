package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051147 Smallest m such that A051145(m) = 2^n.
 * @author Sean A. Irvine
 */
public class A051147 extends A051145 {

  private Z mTarget = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.equals(mTarget)) {
        mTarget = mTarget.multiply2();
        return Z.valueOf(mN);
      }
    }
  }
}
