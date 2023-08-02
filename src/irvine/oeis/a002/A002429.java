package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002429 Numerators of double sums of reciprocals.
 * @author Sean A. Irvine
 */
public class A002429 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int k = 3; k <= 2 * mN + 3; ++k) {
      final Z t = Binomial.binomial(2L * (mN + 1), k - 1).multiply(Stirling.firstKind(k, 3)).shiftLeft(k - 2);
      s = s.add(new Q(t, mF.factorial(k)));
    }
    return s.multiply(3).num();
  }
}
