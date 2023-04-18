package irvine.oeis.a063;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A063048 Numbers n such that the Reverse and Add! trajectory of n (presumably) does not reach a palindrome and does not join the trajectory of any term m &lt; n.
 * @author Sean A. Irvine
 */
public class A063048 extends Sequence1 {

  // NOTE This sequence is inherently heuristic

  private Z mN = Z.valueOf(195);
  private final HashSet<Z> mSeen = new HashSet<>();

  private boolean is(Z n, final int limit) {
    for (int k = 0; k < limit; ++k) {
      if (!mSeen.add(n)) {
        return true;
      }
      if (ZUtils.isPalindrome(n, 10)) {
        return true;
      }
      n = n.add(ZUtils.reverse(n));
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!is(mN, 1000)) {
        return mN;
      }
    }
  }
}
