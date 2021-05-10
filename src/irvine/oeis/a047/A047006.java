package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047006 T(n,n+1), array T given by A047000.
 * @author Sean A. Irvine
 */
public class A047006 extends A047000 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 1);
  }
}
