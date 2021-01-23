package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026709 T(n,[ n/2 ]), T given by A026703.
 * @author Sean A. Irvine
 */
public class A026709 extends A026703 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
