package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000993 Number of distinct quadratic residues <code>mod 10^n</code>; also number of distinct n-digit endings of base-10 squares.
 * @author Sean A. Irvine
 */
public class A000993 implements Sequence {

  private static final Z EIGHTY_THREE = Z.valueOf(83);
  private int mN = -2;
  private Z mFivePower = Z.FIVE;

  @Override
  public Z next() {
    final boolean even = (++mN & 1) == 0;
    if (mN == -1) {
      return Z.ONE;
    }
    mFivePower = mFivePower.multiply(5);
    Z sum = EIGHTY_THREE
      .add(even ? 27 : -27)
      .add(Z.NINE.shiftLeft(mN + 1))
      .add(Z.NINE.multiply(mFivePower))
      .add(mFivePower.shiftLeft(mN + 1));
    final Z a = Z.ONE.shiftLeft(mN + 2);
    if (even) {
      sum = sum.add(a).add(mFivePower);
    } else {
      sum = sum.subtract(a).subtract(mFivePower);
    }
    return sum.divide(72);
  }
}

