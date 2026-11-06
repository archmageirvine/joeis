package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A401432 a(n) is the least k > 1 such that sum_{i = 1..n} k^(A003418(n)/i) is divisible by n.
 * @author Sean A. Irvine
 */
public class A106441 extends Sequence1 {

  private final DirectSequence mLcm = new A003418();
  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      Z sum = Z.ZERO;
      for (long i = 1; i <= mN; ++i) {
        sum = sum.add(k.modPow(mLcm.a(mN).divide(i), n));
      }
      if (sum.mod(mN) == 0) {
        return k;
      }
    }
  }
}
