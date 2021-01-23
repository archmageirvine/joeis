package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026547 a(n) = T(n,[ n/2 ]), T given by A026536.
 * @author Sean A. Irvine
 */
public class A026547 extends A026536 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
