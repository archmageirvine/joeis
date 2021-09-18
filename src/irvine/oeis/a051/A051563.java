package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051563 Third unsigned column of triangle A051380.
 * @author Sean A. Irvine
 */
public class A051563 extends A051380 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L).abs();
  }
}
