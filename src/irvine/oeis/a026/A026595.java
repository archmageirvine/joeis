package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026595 T(n,[ n/2 ]), T given by A026584.
 * @author Sean A. Irvine
 */
public class A026595 extends A026584 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
