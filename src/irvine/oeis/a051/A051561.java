package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051561 Third unsigned column of triangle A051379.
 * @author Sean A. Irvine
 */
public class A051561 extends A051379 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L).abs();
  }
}
