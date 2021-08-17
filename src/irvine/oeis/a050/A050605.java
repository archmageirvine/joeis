package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050605 Column/row 2 of A050602: a(n) = add3c(n,2).
 * @author Sean A. Irvine
 */
public class A050605 extends A050602 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 2L));
  }
}
