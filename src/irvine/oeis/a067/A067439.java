package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067439 a(n) = sum of all the remainders when n is divided by positive integers less than and coprime to n.
 * @author Sean A. Irvine
 */
public class A067439 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k < mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1) {
        sum = sum.add(mN % k);
      }
    }
    return sum;
  }
}
