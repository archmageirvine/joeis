package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001346 <code>a(n) =</code> Sum_{k <code>= 0..4} (n+k)!</code> C(4,k).
 * @author Sean A. Irvine
 */
public class A001346 implements Sequence {

  private int mN = -2;
  private Z mF = Z.ONE;
  private Z mFF = Z.ONE;
  private Z mFFF = Z.TWO;
  private Z mFFFF = Z.SIX;
  private Z mFFFFF = Z.valueOf(24);

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.valueOf(23);
    }
    final Z res = mF.add(mFF.add(mFFFF).shiftLeft(2)).add(mFFF.multiply(6)).add(mFFFFF);
    mF = mFF;
    mFF = mFFF;
    mFFF = mFFFF;
    mFFFF = mFFFFF;
    mFFFFF = mFFFFF.multiply(mN + 5);
    return res;
  }
}
