package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057331 a(n) = smallest prime p such that the first n iterates of p under x-&gt;2x+1 are all primes.
 * @author Sean A. Irvine
 */
public class A057331 extends A000040 {

  {
    setOffset(0);
  }

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(Z p) {
    for (int k = 1; k < mN; ++k) {
      p = p.multiply2().add(1);
      if (!p.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP)) {
      mP = super.next();
    }
    return mP;
  }
}
