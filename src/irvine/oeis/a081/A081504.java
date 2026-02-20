package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081504 Numbers n such that there are no primes of the form 2^n+2^i+1 for 0&lt;i&lt;n. In binary: all 3-bit numbers with size n+1 are composite.
 * @author Sean A. Irvine
 */
public class A081504 extends Sequence1 {

  private Z mA = Z.ONE.shiftLeft(7);
  private int mN = 7;

  private boolean is(final Z t) {
    for (int k = 1; k < mN; ++k) {
      if (t.setBit(k).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      if (is(mA.add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
