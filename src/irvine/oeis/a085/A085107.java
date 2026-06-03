package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085107 Starting with n-1 go on adding the numbers less than n and coprime to it in descending order until one gets a prime. a(n) = this prime, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085107 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = mN - 1; m > 0; --m) {
      if (Functions.GCD.l(m, mN) == 1) {
        sum = sum.add(m);
      }
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
    return Z.ZERO;
  }
}

