package irvine.oeis.a222;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A222208.
 * @author Sean A. Irvine
 */
public class A222208 implements Sequence {

  // Does not use MemorySequence to save memory

  protected final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicBooleanArray mB = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    long h;
    if (++mN < 3) {
      h = 2L * mN - 1;
    } else {
      h = 1;
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        if (d > 1 && d < mN) {
          h = LongUtils.lcm(h, mA.get(d));
        }
      }
    }
    long i = 1;
    while (mB.isSet(i * h)) {
      ++i;
    }
    mB.set(i * h);
    mA.set(mN, i * h);
    return Z.valueOf(i * h);
  }
}
