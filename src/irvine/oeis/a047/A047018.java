package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047018 T(n,n+3), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047018 extends A047010 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
