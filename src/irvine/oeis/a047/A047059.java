package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047059 T(2n,n), array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047059 extends A047050 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN);
  }
}
