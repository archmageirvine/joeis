package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A025034 Least modulus &gt;= 3 having maximum run of n consecutive non-residues.
 * @author Sean A. Irvine
 */
public class A025034 implements Sequence {

  private final LongDynamicLongArray mMax = new LongDynamicLongArray();
  private long mN = 0;

  private long computeMax(final long k) {
    long max = 0;
    long c = 0;
    for (long m = 2; m < k; ++m) {
      if (!A025021.isResidue(m, k)) {
        if (++c > max) {
          max = c;
        }
      } else {
        c = 0;
      }
    }
    return max;
  }

  private long max(final long k) {
    final long m = mMax.get(k);
    if (m != 0) {
      return m - 1;
    }
    final long max = computeMax(k);
    mMax.set(k, max + 1);
    return max;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 2;
    while (true) {
      if (max(++k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

