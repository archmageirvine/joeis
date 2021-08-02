package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049500 Smallest prime p such that p + 4^k is also prime for all k = 1, ..., n.
 * @author Sean A. Irvine
 */
public class A049500 extends A000040 {

  private Z mP = super.next();
  private int mN = 0;

  private boolean isPrimeChain(final Z p) {
    Z t = Z.FOUR;
    for (int k = 0; k < mN; ++k, t = t.shiftLeft(2)) {
      if (!p.add(t).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isPrimeChain(mP)) {
      mP = super.next();
    }
    return mP;
  }
}
