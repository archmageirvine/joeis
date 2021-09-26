package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051718 Numerators of column 2 of table described in A051714/A051715.
 * @author Sean A. Irvine
 */
public class A051718 extends A051714 {

  private long mN = -1;

  @Override
  public Z next() {
    return select(get(++mN, 2L));
  }
}
