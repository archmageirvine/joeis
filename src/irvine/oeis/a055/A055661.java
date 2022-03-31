package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055661 Tower of Hanoi positions (A055662) converted from base 3 to base 10.
 * @author Sean A. Irvine
 */
public class A055661 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (int k = 0, j = 1; k <= LongUtils.lg(mN); ++k, t = t.multiply(3), j = 3 - j) {
      sum = sum.add(t.multiply(j * ((mN / (1L << k) + 1) / 2) % 3));
    }
    return sum;
  }
}
