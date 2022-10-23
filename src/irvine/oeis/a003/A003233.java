package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001950;
import irvine.util.array.LongDynamicArray;

/**
 * A003233 Numbers k such that A003231(A001950(k)) = A001950(A003231(k)).
 * @author Sean A. Irvine
 */
public class A003233 extends Sequence1 {

  private final Sequence mA1950 = new A001950();
  private final Sequence mA3231 = new A003231();
  private final LongDynamicArray<Z> mB1950 = new LongDynamicArray<>();
  private final LongDynamicArray<Z> mB3231 = new LongDynamicArray<>();
  {
    mB1950.set(0, null);
    mB3231.set(0, null);
  }

  private Z a1950(final long n) {
    while (mB1950.length() <= n) {
      mB1950.set(mB1950.length(), mA1950.next());
    }
    return mB1950.get(n);
  }

  private Z a3231(final long n) {
    while (mB3231.length() <= n) {
      mB3231.set(mB3231.length(), mA3231.next());
    }
    return mB3231.get(n);
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long a1950 = a1950(mN).longValueExact();
      final long a3231 = a3231(mN).longValueExact();
      if (a1950(a3231).equals(a3231(a1950))) {
        return Z.valueOf(mN);
      }
    }
  }
}
