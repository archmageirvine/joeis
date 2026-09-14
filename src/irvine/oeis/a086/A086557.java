package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086557 Smallest number not included earlier, beginning with 2 and having prime signature of n.
 * @author Sean A. Irvine
 */
public class A086557 extends Sequence2 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.TWO;
    }
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    Z t = Z.valueOf(20);
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
