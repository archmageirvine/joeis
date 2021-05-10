package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047046 T(n,n+1), array T as in A047040; T(n+1,n), array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047046 extends A047040 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 1);
  }
}
