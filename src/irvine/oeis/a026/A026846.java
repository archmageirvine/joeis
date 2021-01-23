package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026846 a(n) = T(2n+1,n+4), T given by A026725.
 * @author Sean A. Irvine
 */
public class A026846 extends A026725 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
