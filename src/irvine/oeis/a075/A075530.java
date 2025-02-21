package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075522.
 * @author Sean A. Irvine
 */
public class A075530 extends Sequence0 {

  private final Set<Integer> mSeen = new HashSet<>();
  private int mN = -1;
  private final int[] mWorkspace = new int[Integer.SIZE]; // Way more than we can hope to do with this approach

  private void search(final int pos) {
    final int v = mWorkspace[pos];
    if (pos + 1 == mN) {
      // Last iteration
      for (int k = 0; k <= pos; ++k) {
        mSeen.add(mWorkspace[k] + v);
      }
    } else {
      for (int k = 0; k <= pos; ++k) {
        mWorkspace[pos + 1] = mWorkspace[k] + v;
        search(pos + 1);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mSeen.clear();
    mWorkspace[0] = 1;
    search(0);
    int cnt = 0;
    int m = mN;
    while (mSeen.contains(++m)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

