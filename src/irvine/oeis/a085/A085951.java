package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085951 For n &lt;= 5, a(n) = 2n-1. For n &gt; 5, a(n) is the least odd number not already used that begins with the last digit of a(n-1).
 * @author Sean A. Irvine
 */
public class A085951 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = -1;

  @Override
  public Z next() {
    if (mA < 9) {
      mA += 2;
      return Z.valueOf(mA);
    }
    long v = (mA % 10) * 10;
    long d = -1;
    long lim = 10;
    while (true) {
      d += 2;
      if (d >= lim) {
        lim *= 10;
        v *= 10;
        d = 1;
      }
      final long t = v + d;
      if (!mUsed.isSet(t / 2)) {
        mUsed.set(t / 2);
        mA = t;
        return Z.valueOf(mA);
      }
    }
  }
}
