package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A014643 Triangular array starting with <code>{1,1}</code>; then i-th term in a row gives number of i's in next row.
 * @author Sean A. Irvine
 */
public class A014643 implements Sequence {

  private LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0, 2);
  }
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mA.length()) {
      final LongDynamicLongArray newA = new LongDynamicLongArray();
      for (long k = 0, j = 0; k < mA.length(); ++k) {
        for (long i = 0; i < mA.get(k); ++i) {
          newA.set(j++, k + 1);
        }
      }
      mA = newA;
      mN = 0;
    }
    return Z.valueOf(mA.get(mN));
  }
}
