package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057931 Positions at which powers of 2 occur in A057929. (Or -1 if it does not occur.).
 * @author Sean A. Irvine
 */
public class A057931 extends A057929 {

  private Z mTarget = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (Z.ONE.equals(mTarget) || Z.FOUR.equals(mTarget)) {
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
