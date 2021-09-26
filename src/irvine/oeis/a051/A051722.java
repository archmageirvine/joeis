package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051722 Numerators of row 4 of table described in A051714/A051715.
 * @author Sean A. Irvine
 */
public class A051722 extends A051714 {

  private long mN = -1;

  @Override
  public Z next() {
    return select(get(4L, ++mN));
  }
}
