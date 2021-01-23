package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A088265 Numbers of the form 10^n + 1, 3, 7, or 9 for n&gt;=1.
 * @author Sean A. Irvine
 */
public class A088265 implements Sequence {

  private Z mTens = Z.ONE;
  private long mN = 9;

  @Override
  public Z next() {
    if (mN == 9) {
      mTens = mTens.multiply(10);
    }
    mN += mN == 3 ? 4 : 2;
    mN %= 10;
    return mTens.add(mN);
  }
}

