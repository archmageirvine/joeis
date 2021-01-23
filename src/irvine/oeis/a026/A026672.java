package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026672 a(n) = T(2n,n-1), T given by A026670. Also T(2n,n-1)=T(2n+1,n+2), T given by A026725; and T(2n,n-1), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026672 extends A026670 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
