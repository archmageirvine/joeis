package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063407 Number of cyclic subgroups of order 4 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063407 extends A063387 {

  private final Sequence mA = new A063385();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide2();
  }
}
