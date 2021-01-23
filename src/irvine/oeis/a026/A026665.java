package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026665 T(n,[ n/2 ]), T given by A026659.
 * @author Sean A. Irvine
 */
public class A026665 extends A026659 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
