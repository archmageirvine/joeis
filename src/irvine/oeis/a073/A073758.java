package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073758 Smallest number that is neither a divisor of nor relatively prime to n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A073758 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 2; k < mN; ++k) {
      if (mN % k != 0 && Functions.GCD.l(mN, k) > 1) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
