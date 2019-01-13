package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007049.
 * @author Sean A. Irvine
 */
public class A007049 extends A007048 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2L);
  }
}
