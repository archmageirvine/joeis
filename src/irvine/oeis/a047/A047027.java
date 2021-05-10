package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047027 T(n,n+2), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047027 extends A047020 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 2);
  }
}
