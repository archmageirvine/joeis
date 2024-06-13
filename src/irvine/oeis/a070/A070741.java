package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070741 z such that the Diophantine equation x^3+y^4=z^3 has solutions.
 * @author Sean A. Irvine
 */
public class A070741 extends Sequence1 {

  private long mN = 13;

  private boolean is(final long n) {
    final Z n3 = Z.valueOf(n).pow(3);
    for (long x = 1; x < mN; ++x) {
      final Z t = n3.subtract(Z.valueOf(x).pow(3));
      if (t.root(4).auxiliary() == 1) {
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
