package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026885 T(2n,n+3), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026885 extends A026769 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 3);
  }
}
