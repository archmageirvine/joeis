package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063413 Number of cyclic subgroups of order 10 of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063413 extends A063393 {

  private final Sequence mA = new A063388();
  private final Sequence mB = new A063385();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(mB.next()).add(1).divide(4);
  }
}
