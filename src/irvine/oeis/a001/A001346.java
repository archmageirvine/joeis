package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001346 a(n) = Sum_{k = 0..4} (n+k)! C(4,k).
 * @author Sean A. Irvine
 */
public class A001346 extends AbstractSequence {

  /* Construct the sequence. */
  public A001346() {
    super(-1);
  }

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
