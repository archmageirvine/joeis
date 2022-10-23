package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045855 Numbers whose square has initial digit '1'.
 * @author Sean A. Irvine
 */
public class A045855 extends Sequence1 {

  // Smarter than trying each number in turn ...

  private Z mN = Z.ZERO;
  private Z mLimit = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z square = mN.square();
      if (square.compareTo(mLimit) >= 0) {
        mLimit = mLimit.multiply(10);
        final Z b = mLimit.divide2();
        mN = b.sqrt().subtract(b.auxiliary());
      } else {
        return mN;
      }
    }
  }
}

