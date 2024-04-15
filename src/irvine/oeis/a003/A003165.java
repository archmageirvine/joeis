package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003165 a(n) = floor(n/2) + 1 - d(n), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A003165 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2 + 1).subtract(Functions.SIGMA0.z(mN));
  }
}
