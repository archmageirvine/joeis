package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050606 Column/row 3 of A050602: a(n) = add3c(n,3).
 * @author Sean A. Irvine
 */
public class A050606 extends A050602 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 3L));
  }
}
