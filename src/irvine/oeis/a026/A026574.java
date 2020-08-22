package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026574 T(2n,n), T given by A026568.
 * @author Sean A. Irvine
 */
public class A026574 extends A026568 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
