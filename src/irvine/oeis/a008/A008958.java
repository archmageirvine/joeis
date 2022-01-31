package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008958 Triangle of central factorial numbers 4^k T(2n+1, 2n+1-2k).
 * @author Sean A. Irvine
 */
public class A008958 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  private Z a(final int n, final int p) {
    Q sum = Q.ZERO;
    for (int q = 0; q <= n - p; ++q) {
      final Q t = new Q(Z.valueOf(2L * p + 2L * q - 2L * n - 1).pow(2 * n + 1),
        mF.factorial(q).multiply(mF.factorial(2 * n + 1 - 2 * p - q)).shiftRight(2 * (p - n)));
      sum = sum.signedAdd((q & 1) == 1, t);
    }
    return sum.toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return a(mN, mM);
  }
}
