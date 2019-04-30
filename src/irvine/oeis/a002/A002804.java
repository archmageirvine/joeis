package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002804 (Presumed) solution to Waring's problem: <code>g(n) = 2^n + floor((3/2)^n) - 2</code>.
 * @author Sean A. Irvine
 */
public class A002804 implements Sequence {

  private Z mThrees = Z.ONE;
  private Z mTwos = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mThrees = mThrees.multiply(3);
    mTwos = mTwos.multiply2();
    return mTwos.add(mThrees.shiftRight(++mN)).subtract(2);
  }
}

