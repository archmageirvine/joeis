package irvine.oeis.a392;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a237.A237270;
import irvine.oeis.a390.A390628;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A392097 a(n) is the smallest number k for which the symmetric representation of sigma for k, SRS(k), has n parts and each i-th part up to the diagonal is unimodal of width i.
 * @author Sean A. Irvine
 */
public class A392097 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final A390628 mWidthPattern = new A390628();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private int mM = 0;

  private static ArrayList<ArrayList<Long>> splitNonZeroBlocks(final ArrayList<Long> data) {
    final ArrayList<ArrayList<Long>> res = new ArrayList<>();
    int i = 0;
    while (i < data.size()) {
      final boolean key = data.get(i) == 0;
      final ArrayList<Long> block = new ArrayList<>();
      while (i < data.size() && (data.get(i) == 0) == key) {
        block.add(data.get(i));
        ++i;
      }
      // keep only blocks starting with 1 (i.e., non-zero blocks)
      if (!block.isEmpty() && block.get(0) == 1L) {
        res.add(block);
      }
    }
    return res;
  }

  private boolean isOk(final ArrayList<ArrayList<Long>> wP, final int limit) {
    for (int i = 1; i <= limit; ++i) {
      final ArrayList<Long> block = wP.get(i - 1);
      final long max = LongUtils.max(block);
      if (max != i || block.size() != 2L * i - 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final ArrayList<Z> parts = A237270.symmetricRepresentationSigma(mM);
      final int len = parts.size();
      if (len < mN) {
        continue;
      }

      final ArrayList<ArrayList<Long>> wP = splitNonZeroBlocks(mWidthPattern.widthPattern(mM));
      final int limit = (len + (len & 1)) / 2;
      if (wP.size() < limit) {
        continue;
      }

      if (isOk(wP, limit) && mFirsts.get(len) == 0) {
        mFirsts.set(len, mM);
        if (mVerbose) {
          StringUtils.message("Found " + mM + " solution for n=" + len);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }


}
