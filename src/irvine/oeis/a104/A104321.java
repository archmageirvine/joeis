package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A104321 Smallest number m such that A104320(m)=n.
 * @author Sean A. Irvine
 */
public class A104321 extends A104320 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicIntArray mFirst = new LongDynamicIntArray();
  private long mZ = -1;

  @Override
  public Z next() {
    if (++mZ == 0) {
      return Z.ZERO;
    }
    while (mFirst.get(mZ) == 0) {
      final long zeros = super.next().longValueExact();
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n=" + mN);
        if (mN % 10000 == 0) {
          final StringBuilder sb = new StringBuilder();
          for (long k = 0; k < 5000; ++k) {
            if (mFirst.get(k) == 0) {
              if (sb.length() > 0) {
                sb.append(", ");
              }
              sb.append(k);
            }
          }
          StringUtils.message("Cases (k<5000) with no known solution (i.e. A036462):");
          StringUtils.message(sb.toString());
        }
      }
      if (mFirst.get(zeros) == 0) {
        mFirst.set(zeros, mN);
      }
    }
    return Z.valueOf(mFirst.get(mZ));
  }
}

