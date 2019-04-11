package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001345 <code>a(n) =</code> Sum_{k <code>= 0..3} (n+k)!</code> C(3,k).
 * @author Sean A. Irvine
 */
public class A001345 implements Sequence {

  private int mN = -2;
  private Z mF = Z.ONE;
  private Z mFF = Z.ONE;
  private Z mFFF = Z.TWO;
  private Z mFFFF = Z.SIX;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.SEVEN;
    }
    final Z res = mF.add(mFF.add(mFFF).multiply(3)).add(mFFFF);
    mF = mFF;
    mFF = mFFF;
    mFFF = mFFFF;
    mFFFF = mFFFF.multiply(mN + 4);
    return res;
  }
}
