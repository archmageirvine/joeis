package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A014644 Form array starting with {1,1}; then i-th term in a row gives number of i's in next row; sequence is formed from final term in each row.
 * @author Sean A. Irvine
 */
public class A014644 implements Sequence {

  // This is only good for a few terms

  private LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0, 2);
  }

  @Override
  public Z next() {
    final LongDynamicLongArray newA = new LongDynamicLongArray();
    for (long k = 0, j = 0; k < mA.length(); ++k) {
      for (long i = 0; i < mA.get(k); ++i) {
        newA.set(j++, k + 1);
      }
    }
    mA = newA;
    return Z.valueOf(mA.get(mA.length() - 1));
  }
}
