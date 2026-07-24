package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395248 Sprague-Grundy values for the octal game .007.
 * @author Sean A. Irvine
 */
public class A395248 extends Sequence0 {

  private int mN = -1;
  private final ArrayList<Long> mGrundy = new ArrayList<>();
  {
    mGrundy.add(0L);
    mGrundy.add(0L);
    mGrundy.add(0L);
  }

  private long grundy(final int n) {
    if (n < 3) {
      return mGrundy.get(n);
    }
    assert n == mGrundy.size();
    final int s = n - 3;
    final HashSet<Long> seen = new HashSet<>();
    if (n == 3) {
      seen.add(0L);
    } else if (s >= 1) {
      seen.add(mGrundy.get(s));
    }
    for (int k = 1; k <= s / 2; ++k) {
      seen.add(mGrundy.get(s - k) ^ mGrundy.get(k));
    }
    final long g = LongUtils.mex(seen);
    mGrundy.add(g);
    return mGrundy.get(n);
  }

  @Override
  public Z next() {
    return Z.valueOf(grundy(++mN));
  }
}
