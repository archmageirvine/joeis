package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077603 Least k &gt;= 2 such that tau(n) divides tau(n^k), where tau(n) is the number of divisors of n, A000005.
 * @author Sean A. Irvine
 */
public class A077603 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z s = Functions.SIGMA0.z(n);
    long k = 1;
    while (true) {
      if (Functions.SIGMA0.z(n.pow(++k)).mod(s).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
