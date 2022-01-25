package irvine.oeis.a137;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A137651 Triangle read by rows: T(n,k) is the number of primitive (aperiodic) word structures of length n using exactly k different symbols.
 * T(n,k) = Sum{d|n} mu(n/d) * Stirling2(d, k).
 * @author Georg Fischer
 */
public class A137651 extends Triangle {

  /** Construct the sequence. */
  public A137651() {
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
      sum = sum.add(Stirling.secondKind(d, k).multiply(Mobius.mobius(n / d)));
    }
    return sum;
  }
}
