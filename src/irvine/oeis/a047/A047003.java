package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047003 T(n,n-1), array T given by A047000.
 * @author Sean A. Irvine
 */
public class A047003 extends A047000 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
