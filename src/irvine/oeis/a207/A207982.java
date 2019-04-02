package irvine.oeis.a207;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A207982 Least m&gt;1 such that all central binomial coefficients C(2k,k), k&lt;=n, are pairwise not congruent mod m.
 * @author Sean A. Irvine
 */
public class A207982 extends A000984 {

  private final ArrayList<Z> mCentral = new ArrayList<>();
  private int mN = -1;
  private int mLast = 1;

  @Override
  public Z next() {
    mCentral.add(super.next());
    if (++mN == 0) {
      mCentral.add(super.next());
      return Z.TWO;
    }
    int k = mLast;
    final HashSet<Long> seen = new HashSet<>();
    while (true) {
      boolean ok = true;
      seen.clear();
      for (int j = 1; j < mCentral.size(); ++j) {
        if (!seen.add(mCentral.get(j).mod(k))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mLast = k;
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

