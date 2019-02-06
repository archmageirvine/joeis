package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045855.
 * @author Sean A. Irvine
 */
public class A045855 implements Sequence {

  // Smarter than trying each number in turn ...

  private Z mN = Z.ZERO;
  private Z mLimit = Z.valueOf(2);

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

