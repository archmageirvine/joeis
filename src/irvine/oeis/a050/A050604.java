package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050604 Column 3 of A050600: a(n) = add1c(n,3).
 * @author Sean A. Irvine
 */
public class A050604 extends A050600 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 3L));
  }
}
