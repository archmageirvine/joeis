package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057928 Position at which 2^n occurs in A057926, or -1 if it does not occur.
 * @author Sean A. Irvine
 */
public class A057928 extends A057926 {

  private Z mTarget = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (Z.TWO.equals(mTarget)) {
      mTarget = mTarget.multiply2();
      return Z.NEG_ONE;
    }
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
