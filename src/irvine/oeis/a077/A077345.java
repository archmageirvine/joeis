package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077345 a(n) is the n-th prime whose decimal expansion begins with the decimal expansion of n.
 * @author Sean A. Irvine
 */
public class A077345 extends A077344 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

