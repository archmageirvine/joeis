package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390123 allocated for Lucca B. Matias.
 * @author Sean A. Irvine
 */
public class A390123 extends Sequence1 {

  private long mN = 2;

  private boolean is(final long x) {
    final String sx = String.valueOf(x);
    for (long y = 1; y <= x; ++y) {
      final Z z = new Z(sx + y * y);
      final Z r = z.sqrt();
      if (z.auxiliary() == 1 && r.equals(x + y)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

