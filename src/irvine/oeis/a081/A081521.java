package irvine.oeis.a081;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081521 Triangle read by rows: row n contains n terms in increasing order, relatively prime to n, whose sum is a multiple of n and such that the row contains the smallest possible subset of consecutive numbers starting with 1.
 * @author Sean A. Irvine
 */
public class A081521 extends Sequence1 {

  protected long[] mRow = {};
  private int mN = 0;
  private int mM = 0;

  private boolean is(final ArrayList<Long> set, final long r, final long s, final int pos, final int remaining) {
    if (remaining == 0) {
      return s == r;
    }
    for (int k = pos; k < set.size(); ++k) {
      if (s + set.get(k) * remaining <= r && is(set, r, s + set.get(k), k + 1, remaining - 1)) {
        mRow[mN - remaining] = set.get(k);
        return true;
      }
    }
    return false;
  }

  protected void step() {
    mRow = new long[++mN];
    mRow[0] = 1;
    final long m = mN * (mN - 1L) / 2;
    long k = m + mN / (2 - (mN & 1));
    while (true) {
      final ArrayList<Long> v = new ArrayList<>();
      for (long i = 2; i <= k - m; ++i) {
        if (Functions.GCD.l(mN, i) == 1) {
          v.add(i);
        }
      }
      if (v.size() > mN - 2 && is(v, k, 1, 0, mN - 1)) {
        break;
      }
      k += mN;
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      step();
    }
    return Z.valueOf(mRow[mM]);
  }
}
