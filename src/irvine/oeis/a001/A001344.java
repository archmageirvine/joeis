package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001344 <code>a(n) =</code> sum_{k=0..2} (n+k)! * C(2,k).
 * @author Sean A. Irvine
 */
public class A001344 implements Sequence {

  private int mN = -2;
  private Z mF = Z.ONE;
  private Z mFF = Z.ONE;
  private Z mFFF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.TWO;
    }
    final Z res = mF.add(mFF.multiply2()).add(mFFF);
    mF = mFF;
    mFF = mFFF;
    mFFF = mFFF.multiply(mN + 3);
    return res;
  }
}
