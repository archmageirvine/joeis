package irvine.oeis.a086;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086547 Smallest number &gt; n beginning with n and with the prime signature of n.
 * @author Sean A. Irvine
 */
public class A086547 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    Z t = Z.valueOf(10 * mN);
    long lim = 10;
    long k = -1;
    while (true) {
      if (++k == lim) {
        t = t.multiply(10);
        lim *= 10;
        k = 0;
      }
      final Z u = t.add(k);
      if (FactorUtils.leastPrimeSignature(u).equals(sig)) {
        return u;
      }
    }
  }
}
