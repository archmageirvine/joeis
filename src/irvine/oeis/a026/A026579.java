package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026579 T(n,[ n/2 ]), T given by A026568.
 * @author Sean A. Irvine
 */
public class A026579 extends A026568 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
