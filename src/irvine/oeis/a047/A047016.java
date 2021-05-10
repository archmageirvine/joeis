package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047016 T(n,n+1), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047016 extends A047010 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 1);
  }
}
