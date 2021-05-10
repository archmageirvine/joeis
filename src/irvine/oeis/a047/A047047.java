package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047047 T(n,n+2), array T as in A047040; T(n+2,n), array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047047 extends A047040 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 2);
  }
}
