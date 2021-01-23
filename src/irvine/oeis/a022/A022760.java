package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022760 (n-th 6k+1 prime plus n-th 6k+5 prime)/6.
 * @author Sean A. Irvine
 */
public class A022760 extends A022759 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
