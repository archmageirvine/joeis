package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055381 Smallest composite k such that the n closest primes below and above k are symmetric about k.
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
