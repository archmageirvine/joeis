package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022758 (n-th 4k+1 prime plus n-th 4k+3 prime)/4.
 * @author Sean A. Irvine
 */
public class A022758 extends A022757 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
