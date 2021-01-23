package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026844 a(n) = T(2n,n+4), T given by A026725.
 * @author Sean A. Irvine
 */
public class A026844 extends A026725 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 4);
  }
}
