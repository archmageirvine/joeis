package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047026 T(n,n+1), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047026 extends A047020 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 1);
  }
}
