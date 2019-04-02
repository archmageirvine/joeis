package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.ArrayList;

import java.util.HashSet;

/**
 * A002188 Sprague-Grundy values for Grundy's game.
 * @author Sean A. Irvine
 */
public class A002188 implements Sequence {

  private int mN = -1;

  private final ArrayList<Long> mGrundy = new ArrayList<>();
  {
    mGrundy.add(0L);
    mGrundy.add(0L);
    mGrundy.add(0L);
  }

  private long grundy(final int m) {
    if (m >= mGrundy.size()) {
      assert m == mGrundy.size();
      final HashSet<Long> seen = new HashSet<>();
      for (int k = 1; k <= (m - 1) / 2; ++k) {
        if (2 * k != m) {
          seen.add(grundy(m - k) ^ grundy(k));
        }
      }
      long g = 0;
      while (seen.contains(g)) {
        ++g;
      }
      mGrundy.add(g);
    }
    return mGrundy.get(m);
  }

  @Override
  public Z next() {
    return Z.valueOf(grundy(++mN));
  }
}
