package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051720 Numerators of column 3 of table described in A051714/A051715.
 * @author Sean A. Irvine
 */
public class A051720 extends A051714 {

  private long mN = -1;

  @Override
  public Z next() {
    return select(get(++mN, 3L));
  }
}
