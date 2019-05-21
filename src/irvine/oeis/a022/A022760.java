package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022760 <code>(n-th 6k+1</code> prime plus <code>n-th 6k+5 prime)/6</code>.
 * @author Sean A. Irvine
 */
public class A022760 extends A022759 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
