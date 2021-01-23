package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026643 T(n,[ n/2 ]), T given by A026637.
 * @author Sean A. Irvine
 */
public class A026643 extends A026637 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
