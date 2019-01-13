package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007075.
 * @author Sean A. Irvine
 */
public class A007075 extends A007046 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}
