package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047019 T(2n,n), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047019 extends A047010 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
