package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048941 a(n) is twice the coefficient of 1 in the fundamental unit of Q(sqrt(A000037(n))) where A000037 lists the nonsquare numbers.
 * @author Sean A. Irvine
 */
public class A048982 extends A048868 {

  private Z mA = super.next();
  private Z mUpper = Z.ONE;

  @Override
  public Z next() {
    long cnt = 0;
    while (mA.compareTo(mUpper) <= 0) {
      ++cnt;
      mA = super.next();
    }
    mUpper = mUpper.multiply2();
    return Z.valueOf(cnt);
  }
}

