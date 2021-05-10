package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047012 T(n,n), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047012 extends A047010 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
