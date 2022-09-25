package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059436 Smallest number whose set of divisors contains each digit 0-9 at least n times.
 * @author Sean A. Irvine
 */
public class A059436 implements Sequence {

  private int mN = 0;
  private long mM = 107;
  private int mMin = 0;

  private int minCount(final int[] cnts) {
    int min = cnts[0];
    for (final int cnt : cnts) {
      if (cnt < min) {
        min = cnt;
      }
    }
    return min;
  }

  @Override
  public Z next() {
    ++mN;
    while (mMin < mN) {
      final int[] cnts = new int[10];
      for (final Z d : Jaguar.factor(++mM).divisors()) {
        final int[] c = ZUtils.digitCounts(d);
        for (int k = 0; k < cnts.length; ++k) {
          cnts[k] += c[k];
        }
      }
      final int m = minCount(cnts);
      if (m > mMin) {
        mMin = m;
      }
    }
    return Z.valueOf(mM);
  }
}
