package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047009 T(2n,n), array T given by A047000.
 * @author Sean A. Irvine
 */
public class A047009 extends A047000 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
