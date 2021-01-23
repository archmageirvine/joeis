package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026687 T(n,[ n/2 ]), T given by A026681.
 * @author Sean A. Irvine
 */
public class A026687 extends A026681 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
