package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A382630 a(n) is the number of ways that n can be written as b+c*d, where b, c and d are positive integers and b &lt; c &lt; d.
 * @author Sean A. Irvine
 */
public class A382630 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mD = 2;

  @Override
  public Z next() {
    ++mN;
    if (2 * mN + 1 > mD) {
      ++mD;
      for (long c = 2; c < mD; ++c) {
        for (long b = 1; b < c; ++b) {
          mA.increment(b + c * mD);
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
