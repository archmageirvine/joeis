package irvine.oeis.a392;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A392895 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A392895 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;
  private long mRedoLimit = 100;
  private List<Long> mRedoList = new ArrayList<>();

  private long count(final long m) {
    final long[] d = ZUtils.toLong(Jaguar.factor(m).divisors());
    if (d.length < Long.SIZE && (1L << d.length) - 1 < mN) {
      return 0; // No point, it cannot exceed all known n
    }
    long cnt = 0;
    final Z lim = Z.ONE.shiftLeft(d.length);
    for (Z s = Z.ONE; s.compareTo(lim) < 0; s = s.add(1)) {
      long sum = 0;
      for (int k = 0; k < d.length; ++k) {
        if (s.testBit(k)) {
          sum += d[k];
          if (sum > m) {
            break;
          }
        }
      }
      if (m % sum == 0 && ++cnt >= mRedoLimit) {
        return -1;
      }
    }
    return cnt;
  }

  private void update(final long m) {
    final long cnt = count(m);
    if (cnt < 0) {
      mRedoList.add(m);
    } else if (cnt > 0 && mFirsts.get(cnt) == 0) {
      mFirsts.set(cnt, m);
      if (mVerbose) {
        StringUtils.message("Solution for n=" + cnt + " is " + m);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == mRedoLimit) {
      // Reprocess all numbers previously aborted because they had high counts
      if (mVerbose) {
        StringUtils.message("Reprocessing previously hard numbers");
      }
      mRedoLimit *= 10;
      final List<Long> prev = mRedoList;
      mRedoList = new ArrayList<>();
      for (final long m : prev) {
        update(m);
      }
    }
    while (mFirsts.get(mN) == 0) {
      update(++mM);
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
