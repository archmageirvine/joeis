package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000114 Number of cusps of principal congruence subgroup GAMMA^{hat}(n).
 * @author Sean A. Irvine
 */
public class A000114 extends AbstractSequence {

  /** Construct the sequence. */
  public A000114() {
    super(2);
  }

  protected long mN = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.THREE;
    }
    Z b = Z.valueOf(mN).square();
    long d = 2;
    while (d <= mN) {
      if (mN % d == 0) {
        final Z d2 = Z.valueOf(d).square();
        b = b.multiply(d2.subtract(Z.ONE)).divide(d2);
      }
      d = mPrime.nextPrime(d);
    }
    return b.divide2();
  }
}

