package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Binomial;

/**
 * A002429.
 * @author Sean A. Irvine
 */
public class A002429 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int k = 3; k <= 2 * mN + 3; ++k) {
      final Z t = Binomial.binomial(2 * (mN + 1), k - 1).multiply(Stirling.firstKind(k, 3)).shiftLeft(k - 2);
      s = s.add(new Q(t, mF.factorial(k)));
    }
    return s.multiply(3).num();
  }
}
