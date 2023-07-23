package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058805 Number of labeled vertically indecomposable lattices with a fixed top and bottom.
 * @author Sean A. Irvine
 */
public class A058805 extends A058804 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().divide(Math.max(1, mN));
  }
}
