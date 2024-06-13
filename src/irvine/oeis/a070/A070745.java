package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070745 z such that the Diophantine equation x^2 + y^3 = z^2 has solutions.
 * @author Sean A. Irvine
 */
public class A070745 extends Sequence1 {

  private long mN = 2;

  private boolean is(final long n) {
    final Z n2 = Z.valueOf(n).square();
    for (long x = 1; x < mN; ++x) {
      final Z t = n2.subtract(Z.valueOf(x).square());
      if (t.root(3).auxiliary() == 1) {
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
