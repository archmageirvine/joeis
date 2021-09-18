package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051565 Third unsigned column of triangle A051523.
 * @author Sean A. Irvine
 */
public class A051565 extends A051523 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L).abs();
  }
}
