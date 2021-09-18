package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051525 Third unsigned column of triangle A051338.
 * @author Sean A. Irvine
 */
public class A051525 extends A051338 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L).abs();
  }
}
