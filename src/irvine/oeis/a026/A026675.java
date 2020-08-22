package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026675 a(n) = T(2n-1,n-2), T given by A026670. Also T(2n-1,n-2) = T(2n,n+2), T given by A026725 and T(2n,n-2), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026675 extends A026670 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
