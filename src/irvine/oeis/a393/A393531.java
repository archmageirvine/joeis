package irvine.oeis.a393;

import irvine.math.z.Z;

/**
 * A393531 Number of n-digit emirp pairs in A393530.
 * @author Sean A. Irvine
 */
public class A393531 extends A393530 {

  private Z mA = super.next();
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long cnt = 0;
    while (mA.compareTo(mLim) < 0) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt / 2);
  }
}

