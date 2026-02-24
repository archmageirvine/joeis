package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A075063 Smallest prime == 1 mod first n composite numbers.
 * @author Sean A. Irvine
 */
public class A075063 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(final Z p, final int n) {
    final Sequence comp = new A002808();
    for (int k = 0; k < n; ++k) {
      if (!p.mod(comp.next()).isOne()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP, mN)) {
      mP = super.next();
    }
    return mP;
  }
}

