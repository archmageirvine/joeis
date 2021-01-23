package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026854 a(n) = T(2n+1,n+1), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026854 extends A026736 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 1);
  }
}
