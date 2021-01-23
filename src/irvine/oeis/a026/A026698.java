package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026698 T(n,[ n/2 ]), T given by A026692.
 * @author Sean A. Irvine
 */
public class A026698 extends A026692 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
