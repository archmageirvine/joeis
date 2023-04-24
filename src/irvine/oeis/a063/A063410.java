package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063410 Number of cyclic subgroups of order 7 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063410 extends A063390 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide(6);
  }
}
