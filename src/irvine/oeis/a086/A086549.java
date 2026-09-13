package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086549 Smallest number not included earlier, beginning with 1 and having the prime signature of n.
 * @author Sean A. Irvine
 */
public class A086549 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    Z t = Z.TEN;
    long lim = 10;
    long k = -1;
    while (true) {
      if (++k == lim) {
        t = t.multiply(10);
        lim *= 10;
        k = 0;
      }
      final Z u = t.add(k);
      if (FactorUtils.leastPrimeSignature(u).equals(sig) && mUsed.add(u)) {
        return u;
      }
    }
  }
}
