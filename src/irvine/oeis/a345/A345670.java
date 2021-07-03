package irvine.oeis.a345;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A345670 allocated for Treanungkur Mal.
 * @author Sean A. Irvine
 */
public class A345670 implements Sequence {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final ArrayList<CR> mLimits = new ArrayList<>();
  {
    mLimits.add(CR.ONE);
  }
  private int mN = -1;
  private long mM = 0;

  private CR limit(final int k) {
    if (k >= mLimits.size()) {
      mLimits.add(mLimits.get(mLimits.size() - 1).divide(CR.TEN));
    }
    return mLimits.get(k);
  }

  private int zeros(final CR v) {
    int c = 0;
    while (v.compareTo(limit(c)) < 0) {
      ++c;
    }
    return c - 1;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final CR kz = CR.valueOf(++mM);
      final CR cos = kz.cos();
      final CR t = cos.subtract(CR.valueOf(cos.round())).abs();
      final int z = zeros(t);
      if (mFirsts.get(z) == 0) {
        mFirsts.set(z, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
