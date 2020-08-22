package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026717 T(2n,n-2), T given by A026714.
 * @author Sean A. Irvine
 */
public class A026717 extends A026714 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
