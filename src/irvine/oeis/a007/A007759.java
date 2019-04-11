package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007759 Knopfmacher expansion of <code>sqrt(2)</code>: <code>a(2n)=2(a(2n-1)+1)^2 - 1, a(2n+1)=2a(2n)^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A007759 implements Sequence {

  private Z mA = null;
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    mA = mA == null ? Z.TWO : (mEven ? mA.add(1).square().multiply2().subtract(1) : mA.square().multiply2().subtract(2));
    return mA;
  }
}
