package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063409 Number of cyclic subgroups of order 6 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063409 extends A063389 {

  private final Sequence mA = new A063386();
  private final Sequence mB = new A063385();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(mB.next()).add(1).divide2();
  }
}
