package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047002 T(n,n), array T given by A047000.
 * @author Sean A. Irvine
 */
public class A047002 extends A047000 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
