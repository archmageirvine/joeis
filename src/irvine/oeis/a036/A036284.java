package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036284 Periodic vertical binary vectors of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A036284 extends Sequence0 {

  private int mN = -1;
  private int mLimit = 0;

  @Override
  public Z next() {
    ++mN;
    mLimit = mLimit == 0 ? 3 : mLimit * 2;
    Z sum = Z.ZERO;
    Z a = Z.ZERO;
    Z b = Z.ONE;
    for (int k = 1; k < mLimit; ++k) {
      if (b.testBit(mN)) {
        sum = sum.add(Z.ONE.shiftLeft(k));
      }
      final Z t = a.add(b);
      a = b;
      b = t;
    }
    return sum;
  }
}

