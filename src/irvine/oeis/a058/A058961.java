package irvine.oeis.a058;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058961 Number of possible sets {sum(T) : T contained in S}, where S is a multiset of elements of Z/nZ.
 * @author Sean A. Irvine
 */
public class A058961 implements Sequence {

  private final Set<Z> mSubsetSums = new HashSet<>();
  private int mN = 0;

  private boolean bump(final int[] set) {
    for (int k = set.length - 1; k >= 0; --k) {
      if (++set[k] < mN) {
        for (int j = k + 1; j < set.length; ++j) {
          set[j] = set[k];
        }
        return true;
      }
    }
    return false;
  }

  private Z search(final int[] multiset, final int pos, final int sum) {
    if (pos >= multiset.length) {
      return Z.ONE.shiftLeft(sum);
    }
    Z res = search(multiset, pos + 1, sum);
    if (multiset[pos] != 0) {
      final int s = (sum + multiset[pos]) % mN;
      res = res.or(search(multiset, pos + 1, s));
    }
    return res;
  }

  @Override
  public Z next() {
    final int[] multiset = new int[mN++];
    mSubsetSums.clear();
    do {
      mSubsetSums.add(search(multiset, 0, 0));
    } while (bump(multiset));
    return Z.valueOf(mSubsetSums.size());
  }
}
