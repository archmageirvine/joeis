package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001244.
 * @author Sean A. Irvine
 */
public class A001244 implements Sequence {

  private int mN = 0;

  private Z mTwo = Z.ONE;
  private Z mThree = Z.ONE;
  private Z mFour = Z.ONE;
  private Z mFive = Z.ONE;
  private Z mSix = Z.ONE;
  private Z mSeven = Z.ONE;
  private Z mEight = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    final Z n2 = n.multiply(n);
    final Z n3 = n2.multiply(n);
    final Z n4 = n3.multiply(n);
    final Z n5 = n4.multiply(n);
    final Z n6 = n5.multiply(n);
    final Z n7 = n6.multiply(n);

    mTwo = mTwo.multiply2();
    mThree = mThree.multiply(3);
    mFour = mFour.shiftLeft(2);
    mFive = mFive.multiply(5);
    mSix = mSix.multiply(6);
    mSeven = mSeven.multiply(7);
    mEight = mEight.shiftLeft(3);

    return mTwo.multiply(n6).multiply(896)
      .subtract(n7)
      .subtract(n6.multiply(35))
      .subtract(mThree.multiply(n5).multiply(91854))
      .add(mTwo.multiply(n5).multiply(29568))
      .subtract(n5.multiply(511))
      .add(mTwo.multiply(n4).multiply(398720))
      .subtract(mThree.multiply(n4).multiply(2755620))
      .add(mFour.multiply(n4).multiply(3440640))
      .subtract(n4.multiply(4025))
      .add(mTwo.multiply(n3).multiply(2808960))
      .add(mFour.multiply(n3).multiply(89456640))
      .subtract(mThree.multiply(n3).multiply(32608170))
      .subtract(mFive.multiply(n3).multiply(65625000))
      .subtract(n3.multiply(18424))
      .add(mTwo.multiply(n2).multiply(10889984))
      .subtract(mThree.multiply(n2).multiply(190137780))
      .subtract(n2.multiply(48860))
      .add(mFour.multiply(n2).multiply(863600640))
      .subtract(mFive.multiply(n2).multiply(1378125000))
      .add(mSix.multiply(n2).multiply(705438720))
      .subtract(n.multiply(69264))
      .add(mFour.multiply(n).multiply(3667722240L))
      .subtract(mThree.multiply(n).multiply(545980176))
      .subtract(mSeven.multiply(n).multiply(4150656720L))
      .add(mSix.multiply(n).multiply(10581580800L))
      .add(mTwo.multiply(n).multiply(21998592))
      .subtract(mFive.multiply(n).multiply(9581250000L))
      .subtract(mSeven.multiply(33205253760L))
      .add(mSix.multiply(39504568320L))
      .add(mTwo.multiply(18063360))
      .subtract(40320)
      .add(mFour.multiply(5780275200L))
      .subtract(mFive.multiply(22050000000L))
      .subtract(mThree.multiply(617258880L))
      .add(mEight.multiply(10569646080L))
      .divide(5040);
  }
}

