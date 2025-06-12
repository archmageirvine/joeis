package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077757 Smallest n-digit multiple of n with digit sum n.
 * @author Sean A. Irvine
 */
public class A077757 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z lo = Z.TEN.pow(mN++);
    Z m = lo.divide(mN).multiply(mN);
    if (m.compareTo(lo) < 0) {
      m = m.add(mN);
    }
    while (Functions.DIGIT_SUM.l(m) != mN) {
      m = m.add(mN);
    }
    return m;
  }
}

