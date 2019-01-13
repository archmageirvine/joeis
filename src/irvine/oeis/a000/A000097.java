package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A000097.
 * @author Sean A. Irvine
 */
public class A000097 implements Sequence {

  private long mN = 0;
  private final LongDynamicArray<Z> mA70 = new LongDynamicArray<>();
  private final Sequence mS70 = new A000070();

  private Z a70(final long n) {
    long l = mA70.length();
    while (n >= l) {
      mA70.set(l++, mS70.next());
    }
    return mA70.get(n);
  }

  @Override
  public Z next() {
    Z r = Z.ZERO;
    for (long j = 0; j <= mN; j += 2) {
      r = r.add(a70(mN - j));
    }
    ++mN;
    return r;
  }
}

