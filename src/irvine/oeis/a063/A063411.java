package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063411 Number of cyclic subgroups of order 8 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063411 extends A063391 {

  private final Sequence mA = new A063387();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide(4);
  }
}
