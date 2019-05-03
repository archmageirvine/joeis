package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001243 Eulerian numbers <code>(Euler</code>'s triangle: column <code>k=7</code> of <code>A008292</code>, column <code>k=6</code> of <code>A173018)</code>.
 * @author Sean A. Irvine
 */
public class A001243 implements Sequence {

  private int mN = 0;

  private Z mTwo = Z.ONE;
  private Z mThree = Z.ONE;
  private Z mFour = Z.ONE;
  private Z mFive = Z.ONE;
  private Z mSix = Z.ONE;
  private Z mSeven = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    final Z n2 = n.multiply(n);
    final Z n3 = n2.multiply(n);
    final Z n4 = n3.multiply(n);
    final Z n5 = n4.multiply(n);
    final Z n6 = n5.multiply(n);

    mTwo = mTwo.multiply2();
    mThree = mThree.multiply(3);
    mFour = mFour.shiftLeft(2);
    mFive = mFive.multiply(5);
    mSix = mSix.multiply(6);
    mSeven = mSeven.multiply(7);

    return mFive.multiply(236250000)
      .subtract(mSix.multiply(235146240))
      .add(mFive.multiply(n2).multiply(5625000))
      .add(mFive.multiply(n).multiply(73125000))
      .subtract(mTwo.multiply(967680))
      .subtract(mSix.multiply(n).multiply(33592320))
      .subtract(mTwo.multiply(n5).multiply(384))
      .subtract(mTwo.multiply(n4).multiply(9600))
      .subtract(mTwo.multiply(n3).multiply(94080))
      .subtract(mTwo.multiply(n2).multiply(451200))
      .subtract(mTwo.multiply(n).multiply(1057536))
      .add(mThree.multiply(n3).multiply(481140))
      .add(n.multiply(8028))
      .add(mThree.multiply(n).multiply(13953060))
      .add(mThree.multiply(n4).multiply(21870))
      .add(mThree.multiply(n2).multiply(3914730))
      .add(n6)
      .add(n4.multiply(295))
      .add(n5.multiply(27))
      .subtract(mFour.multiply(n3).multiply(491520))
      .subtract(mFour.multiply(n2).multiply(8847360))
      .subtract(mFour.multiply(n).multiply(52592640))
      .subtract(mFour.multiply(103219200))
      .add(mThree.multiply(18370800))
      .add(n3.multiply(1665))
      .add(mSeven.multiply(84707280))
      .add(n2.multiply(5104))
      .add(5040)
      .divide(720);
  }
}
