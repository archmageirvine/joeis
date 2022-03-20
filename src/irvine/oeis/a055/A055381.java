package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055381 Smallest number such that n closest primes below and above it are symmetric.
 * @author Sean A. Irvine
 */
public class A055381 extends A055380 {

  private long mM = 4;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (is(mM, mN) == 0) {
      ++mM;
    }
    return Z.valueOf(mM);
  }

}
