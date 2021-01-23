package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026660 T(2n,n), T given by A026659.
 * @author Sean A. Irvine
 */
public class A026660 extends A026659 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
