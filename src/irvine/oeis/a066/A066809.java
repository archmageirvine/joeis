package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066808.
 * @author Sean A. Irvine
 */
public class A066809 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long c = 1; c <= mN; ++c) {
      for (long b = c; b <= mN; ++b) {
        sum = sum.add(c + mN % b - (mN + c) % b);
      }
    }
    return sum;
  }
}

