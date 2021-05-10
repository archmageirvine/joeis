package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047028 T(n,n+3), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047028 extends A047020 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
