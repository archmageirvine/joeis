package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070756 extends Sequence1 {

  private long mN = 29;

  private boolean is(final long n) {
    final Z n4 = Z.valueOf(n).pow(4);
    for (long x = 1; x < mN; ++x) {
      final Z t = n4.subtract(Z.valueOf(x).pow(4));
      if (t.root(5).auxiliary() == 1) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
