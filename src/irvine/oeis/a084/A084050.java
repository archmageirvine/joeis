package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A084050 Numbers n such that at least one permutation of the digits of n yields a palindrome.
 * @author Sean A. Irvine
 */
public class A084050 extends Sequence1 {

  private long mN = 0;

  private boolean is(final int[] c) {
    boolean odd = false;
    c[0] = 0; // can always be made into leading 0's
    for (final int v : c) {
      if ((v & 1) == 1) {
        if (odd) {
          return false;
        }
        odd = true;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(ZUtils.digitCounts(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

