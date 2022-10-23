package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023811 Largest metadrome (number with digits in strict ascending order) in base n.
 * @author Sean A. Irvine
 */
public class A023811 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z n = Z.valueOf(mN);
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(n.pow(mN - 1 - k).multiply(k));
    }
    return sum;
  }
}

