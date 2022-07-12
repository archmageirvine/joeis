package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057925 Position of first occurrence of 2^n in A057923.
 * @author Sean A. Irvine
 */
public class A057925 extends A057923 {

  private Z mTarget = null;
  private long mN = -1;

  @Override
  public Z next() {
    if (mTarget == null) {
      mTarget = Z.ONE;
      return Z.TWO;
    }
    mTarget = mTarget.multiply2();
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.equals(mTarget)) {
        return Z.valueOf(mN);
      }
    }
  }
}
