package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075563 Rearrangement of natural numbers such that n-th partial sum is == n (mod p(n)).
 * @author Sean A. Irvine
 */
public class A075563 extends A000040 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long p = super.next().longValueExact();
    long m = 0;
    while (true) {
      if (!mUsed.isSet(++m)) {
        final Z s = mSum.add(m);
        if (s.mod(p) == mN) {
          mSum = s;
          mUsed.set(m);
          return Z.valueOf(m);
        }
      }
    }
  }
}

