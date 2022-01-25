package irvine.oeis.a087;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A087854 Triangle read by rows: T(n,k) is the number of n-bead necklaces with exactly k different colored beads.
 * T(n,k) = (k!/n) * Sum_{d|n} phi(d) * S2(n/d, k)
 * @author Georg Fischer
 */
public class A087854 extends Triangle {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /** Construct the sequence. */
  public A087854() {
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    if (n == 0) {
      return Z.ONE;
    }
    ++n;
    ++k;
    Z sum = Z.ZERO;
    for (final Z zd : Cheetah.factor(n).divisors()) {
      final int d = zd.intValue();
      sum = sum.add(Stirling.secondKind(n / d, k).multiply(LongUtils.phi(d)));
    }
    return sum.multiply(FACTORIAL.factorial(k)).divide(n);
  }
}
