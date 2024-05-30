package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068509 a(n) = maximum length of a subset in {1,..,n} whose integers have pairwise LCM not exceeding n.
 * @author Sean A. Irvine
 */
public class A068509 extends Sequence1 {

  private int mN = 0;
  private int mMaxLength = 0;

  private void search(final int lcm, final int terms, final int prev) {
    if (terms > mMaxLength) {
      mMaxLength = terms;
    }
    for (int k = prev + 1; k <= mN; ++k) {
      final int l = Functions.LCM.i(lcm, k);
      if (l <= mN) {
        search(l, terms + 1, k);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMaxLength = 0;
    search(1, 0, 0);
    return Z.valueOf(mMaxLength);
  }
}

