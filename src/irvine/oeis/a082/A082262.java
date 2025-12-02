package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082262 Average of row n of A082259.
 * @author Sean A. Irvine
 */
public class A082262 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long r = 0;
    for (long m = 0; m < mN; ++m) {
      do {
        r += mN;
      } while (Functions.DIGIT_SUM.l(r) != mN);
      sum = sum.add(r);
    }
    return sum.divide(mN);
  }
}
