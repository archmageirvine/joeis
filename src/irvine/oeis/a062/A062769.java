package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003285;

/**
 * A062769 Smallest number m such that the continued fraction expansion of sqrt(m) has period length 2n + 1.
 * @author Sean A. Irvine
 */
public class A062769 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final A003285 periods = new A003285();
    long m = 1;
    final Z n = Z.valueOf(mN);
    while (!n.equals(periods.next())) {
      ++m;
    }
    return Z.valueOf(m);
  }
}
