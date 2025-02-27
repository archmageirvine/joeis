package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075564 Rearrangement of natural numbers such that n-th partial sum is == n (mod c(n)). where c(n) is the n-th composite number.
 * @author Sean A. Irvine
 */
public class A075564 extends A002808 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long c = super.next().longValueExact();
    long m = 0;
    while (true) {
      if (!mUsed.isSet(++m)) {
        final Z s = mSum.add(m);
        if (s.mod(c) == mN) {
          mSum = s;
          mUsed.set(m);
          return Z.valueOf(m);
        }
      }
    }
  }
}

