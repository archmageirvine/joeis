package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026674 a(n) = T(2n-1,n-1) = T(2n,n+1), T given by A026725.
 * @author Sean A. Irvine
 */
public class A026674 extends A026670 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
