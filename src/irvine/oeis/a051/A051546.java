package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051546 Third unsigned column of triangle A051339.
 * @author Sean A. Irvine
 */
public class A051546 extends A051339 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L).abs();
  }
}
