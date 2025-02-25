package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075529 Let x(0),...,x(n), be an additive chain of length n+1 with x(0)=1 and satisfying x(k) = x(k-1) + x(j) for some j &lt; k. a(n) is the number of distinct possible values taken on by x(n).
 * @author Sean A. Irvine
 */
public class A075529 extends Sequence0 {

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
    return Z.valueOf(mSeen.size());
  }
}

