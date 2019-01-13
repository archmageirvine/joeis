package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007050.
 * @author Sean A. Irvine
 */
public class A007050 extends A007048 {

  private long mN = 5;

  @Override
  public Z next() {
    return get(++mN, 3L);
  }
}
