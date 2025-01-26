package irvine.oeis.a074;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074709 Base 4 expansion of 1/n has equal percentage of each digit 0,1,2,3.
 * @author Sean A. Irvine
 */
public class A074709 extends Sequence1 {

  // After Robert Israel

  private long mN = 33;

  private int[] counts(Z n, final long m) {
    final int[] cnts = new int[4];
    for (int k = 0; k < m; ++k) {
      ++cnts[n.and(Z.THREE).intValue()];
      n = n.shiftRight(2);
    }
    return cnts;
  }

  private boolean is(final long n) {
    if ((n & 3) == 0) {
      return false;
    }
    if ((n & 1) == 1) {
      final long m = Functions.ORDER.l(n, 4);
      if ((m & 3) != 0) {
        return false;
      }
      return IntegerUtils.isConstant(counts(Z.FOUR.pow(m).add(Z.FOUR.pow(m).subtract(1).divide(n)), m));
    } else {
      final long m = Functions.ORDER.l(n / 2, 4);
      if ((m & 3) != 0) {
        return false;
      }
      return IntegerUtils.isConstant(counts(Z.FOUR.pow(m).add(Z.FOUR.pow(m).subtract(1).multiply(4).divide(n)), m));
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
