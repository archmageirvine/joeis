package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084087 Numbers k not divisible by 3 such that the exponent of the highest power of 2 dividing k is even.
 * @author Georg Fischer
 */
public class A084087 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN % 3 == 0 || (Functions.VALUATION.i(mN, Z.TWO) & 1) != 0) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
