package irvine.oeis.a058;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A058961 Number of possible sets {sum(T) : T contained in S}, where S is a multiset of elements of Z/nZ.
 * @author Sean A. Irvine
 */
public class A058961 extends Sequence1 {

  private final Set<Z> mSubsetSums = new HashSet<>();
  private int mN = 0;

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
    final Bumper bumper = BumperFactory.weaklyIncreasing(mN - 1);
    mSubsetSums.clear();
    do {
      mSubsetSums.add(search(multiset, 0, 0));
    } while (bumper.bump(multiset));
    return Z.valueOf(mSubsetSums.size());
  }
}
