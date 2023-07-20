package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000129;

/**
 * A008555 Primitive parts of Pell numbers.
 * @author Sean A. Irvine
 */
public class A008555 extends MemorySequence {

  private final A000129 mPell = new A000129();
  {
    setOffset(1);
    add(mPell.next());
  }

  @Override
  protected Z computeNext() {
    Z pell = mPell.next();
    final int n = size();
    if (n == 1) {
      return pell;
    }
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        pell = pell.divide(a(d));
      }
    }
    return pell;
  }
}
