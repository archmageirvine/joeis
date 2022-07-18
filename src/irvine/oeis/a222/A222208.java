package irvine.oeis.a222;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A222208.
 * @author Sean A. Irvine
 */
public class A222208 extends MemorySequence {

  private final LongDynamicBooleanArray mB = new LongDynamicBooleanArray();
  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    long h;
    if (n < 3) {
      h = 2L * n - 1;
    } else {
      Z hh = Z.ONE;
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final int d = dd.intValue();
        if (d > 1 && d < n) {
          hh = hh.lcm(get(d));
        }
      }
      h = hh.longValueExact();
    }
    long i = 1;
    while (mB.isSet(i * h)) {
      ++i;
    }
    mB.set(i * h);
    return Z.valueOf(i * h);
  }
}
