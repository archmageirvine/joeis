package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063406 Number of cyclic subgroups of order 3 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063406 extends A063386 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
