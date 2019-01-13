package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001347.
 * @author Sean A. Irvine
 */
public class A001347 implements Sequence {

  private int mN = -2;
  private Z mF = Z.ONE;
  private Z mFF = Z.ONE;
  private Z mFFF = Z.TWO;
  private Z mFFFF = Z.SIX;
  private Z mFFFFF = Z.valueOf(24);
  private Z mFFFFFF = Z.valueOf(120);

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.valueOf(88);
    }
    final Z res = mF.add(mFF.add(mFFFFF).multiply(5)).add(mFFF.add(mFFFF).multiply(10)).add(mFFFFFF);
    mF = mFF;
    mFF = mFFF;
    mFFF = mFFFF;
    mFFFF = mFFFFF;
    mFFFFF = mFFFFFF;
    mFFFFFF = mFFFFFF.multiply(mN + 6);
    return res;
  }
}
