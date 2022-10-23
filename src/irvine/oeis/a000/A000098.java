package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A000098 Number of partitions of n if there are two kinds of 1, two kinds of 2 and two kinds of 3.
 * @author Sean A. Irvine
 */
public class A000098 extends Sequence0 {

  private long mN = 0;
  private final LongDynamicArray<Z> mA97 = new LongDynamicArray<>();
  private final Sequence mS97 = new A000097();

  private Z a97(final long n) {
    long l = mA97.length();
    while (n >= l) {
      mA97.set(l++, mS97.next());
    }
    return mA97.get(n);
  }

  @Override
  public Z next() {
    Z r = Z.ZERO;
    for (long j = 0; j <= mN; j += 3) {
      r = r.add(a97(mN - j));
    }
    ++mN;
    return r;
  }
}

