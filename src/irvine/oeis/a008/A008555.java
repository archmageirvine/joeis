package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000129;

/**
 * A008555.
 * @author Sean A. Irvine
 */
public class A008555 extends MemorySequence {

  private final A000129 mPell = new A000129();
  {
    add(mPell.next());
  }

  @Override
  protected Z computeNext() {
    Z pell = mPell.next();
    final int n = size();
    if (n == 1) {
      return pell;
    }
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        pell = pell.divide(get(d));
      }
    }
    return pell;
  }
}
