package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073545 Least k such that 1/tau(k) + 1/tau(k+1) + 1/tau(k+2) + ... + 1/tau(k+n) is equal to 1 (where tau(k)=A000005(k) is the number of divisors of k).
 * @author Sean A. Irvine
 */
public class A073545 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      Q sum = Q.ZERO;
      for (long j = 0; j <= mN; ++j) {
        sum = sum.add(new Q(1, Functions.SIGMA0.l(k + j)));
        if (sum.compareTo(Q.ONE) > 0) {
          break;
        }
      }
      if (sum.equals(Q.ONE)) {
        return Z.valueOf(k);
      }
    }
  }
}
