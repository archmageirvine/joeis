package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048982 Number of numbers which have a "prime-rich" reduced residue system (RRS) and binary order n.
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

