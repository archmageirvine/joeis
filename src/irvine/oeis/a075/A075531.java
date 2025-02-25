package irvine.oeis.a075;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075531 Number of gaps in the set of all possible values in the set X(n) given in A075529.
 * @author Sean A. Irvine
 */
public class A075531 extends Sequence0 {

  private final Set<Integer> mSeen = new TreeSet<>();
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
      return Z.ZERO;
    }
    mSeen.clear();
    mWorkspace[0] = 1;
    search(0);
    int gaps = 0;
    int m = mN;
    for (final int v : mSeen) {
      if (v - m != 1) {
        ++gaps;
      }
      m = v;
    }
    return Z.valueOf(gaps);
  }
}

