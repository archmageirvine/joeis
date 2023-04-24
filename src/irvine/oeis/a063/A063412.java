package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063412 Number of cyclic subgroups of order 9 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063412 extends A063392 {

  private final Sequence mA = new A063386();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide(6);
  }
}
