package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.factorial.MemoryFactorial;

/**
 * A002405.
 * @author Sean A. Irvine
 */
public class A002405 extends A002397 {

  private long mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  private Q beta(final long n) {
    Q s = Q.ZERO;
    for (long k = 0; k <= n; ++k) {
      final Q t = new Q(1, n + 1 - k).multiply(Stirling.generalizedFirstKind(-(n - 1), n, k));
      s = s.signedAdd(((n - k) & 1) == 0, t);
    }
    return s.divide(mF.factorial((int) n));
  }

  @Override
  public Z next() {
    return beta(++mN).multiply(super.next()).toZ().abs();
  }
}

