package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063408 Number of cyclic subgroups of order 5 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063408 extends A063388 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide(4);
  }
}
