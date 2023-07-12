package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Euler;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A087854 Triangle read by rows: T(n,k) is the number of n-bead necklaces with exactly k different colored beads.
 * T(n,k) = (k!/n) * Sum_{d|n} phi(d) * S2(n/d, k)
 * @author Georg Fischer
 */
public class A087854 extends Triangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A087854() {
    setOffset(1);
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
    for (final Z zd : Jaguar.factor(n).divisors()) {
      final int d = zd.intValue();
      sum = sum.add(Stirling.secondKind(n / d, k).multiply(Euler.phiAsLong(d)));
    }
    return sum.multiply(FACTORIAL.factorial(k)).divide(n);
  }
}
