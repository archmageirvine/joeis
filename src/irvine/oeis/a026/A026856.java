package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026856 a(n) = T(2n+1,n+3), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026856 extends A026736 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 3);
  }
}
