package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077662 a(n) = n-th positive integer not relatively prime to n, with a(1)=1.
 * @author Sean A. Irvine
 */
public class A077662 extends A077661 {

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
