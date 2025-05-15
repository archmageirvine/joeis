package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077317 a(n) is the n-th prime == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A077317 extends A077316 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
