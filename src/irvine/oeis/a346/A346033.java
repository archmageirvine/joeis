package irvine.oeis.a346;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A346033 a(n) is the smallest integer k &gt; 0 such that 10^(-n-1) &lt; |sin(k) - round(sin(k))| &lt; 10^(-n).
 * @author Sean A. Irvine
 */
public class A346033 implements Sequence {

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
      final CR sin = kz.sin();
      final CR t = sin.subtract(CR.valueOf(sin.round())).abs();
      final int z = zeros(t);
      if (mFirsts.get(z) == 0) {
        mFirsts.set(z, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
