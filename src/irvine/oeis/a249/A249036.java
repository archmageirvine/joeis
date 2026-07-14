package irvine.oeis.a249;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A249036 a(1)=1, a(2)=2; thereafter a(n) = a(n-1-(number of even terms so far)) + a(n-1-(number of odd terms so far)).
 * @author Georg Fischer
 */
public class A249036 extends AbstractSequence {

  private int mN;
  private ArrayList<Z> mA;
  private int mEven;
  private int mOdd;
  private int mMask;

  /** Construct the sequence. */
  public A249036() {
    this(1, 0b001);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param mask bit 0: yield sequence (0) or count (1), bit 1: yield odd (1) or even (0) count, bit 2: add a(n-1) (1) or not (0)
   */
  public A249036(final int offset, final int mask) {
    super(offset);
    mN = 0;
    mA = new ArrayList<>();
    mA.add(Z.ZERO); // [0] not used
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mEven = 0;
    mOdd = 0;
    mMask = mask;
  }

  @Override
  public Z next() {
    Z result;
    switch (++mN) {
      case 1:
      case 2:
        result = mA.get(mN);
        break;
      default:
        result = mA.get(mN - 1 - mEven).add(mA.get(mN - 1 - mOdd));
        if ((mMask & 0b100) > 0) {
          result = result.add(mA.get(mN - 1));
        }
        mA.add(result);
        break;
    }
    if (result.testBit(0)) {
      ++mOdd;
    } else {
      ++mEven;
    }
    return (mMask & 0b001) > 0 ? result : Z.valueOf((mMask & 0b010) > 0 ? mOdd : mEven);
  }
}
