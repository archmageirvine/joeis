package irvine.oeis.a055;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055505 Numerators in expansion of (1-x)^(-1/x)/e.
 * @author Sean A. Irvine
 */
public class A055505 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  protected Z select(final Q sum) {
    return sum.num().abs();
  }

  @Override
  public Z next() {
    ++mN;
    Q recipAltFactorialSum = Q.ZERO;
    Q sum = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      recipAltFactorialSum = recipAltFactorialSum.signedAdd((k & 1) == 0, new Q(Z.ONE, mF.factorial(k)));
      final int u = 2 * mN - k;
      sum = sum.add(recipAltFactorialSum.multiply(Stirling.firstKind(u, mN - k)).divide(mF.factorial(u)));
    }
    return select(sum);
  }
}
