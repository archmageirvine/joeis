package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022895.
 * @author Sean A. Irvine
 */
public class A022895 extends A022894 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(1L, ++mN);
  }
}
