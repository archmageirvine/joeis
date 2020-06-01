package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001120 <code>a(0) = a(1) = 1;</code> for <code>n &gt; 1, a(n) = n*a(n-1) + (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A001120 implements Sequence {

  private Z mPrev = Z.TWO;
  private long mN = -1;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mA = -mA;
    mPrev = mPrev.multiply(mN).add(mA);
    return mPrev;
  }
}

