package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058803 Vertically indecomposable lattices on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A058803 extends A058804 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().multiply(Math.max(1, mN + 1));
  }
}
