package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001347 a(n) = Sum_{k=0..5} (n+k)! * C(5,k).
 * @author Sean A. Irvine
 */
public class A001347 extends AbstractSequence {

  /** Construct the sequence. */
  public A001347() {
    super(-1);
  }

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
