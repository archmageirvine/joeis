package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022758 <code>(n-th 4k+1</code> prime plus <code>n-th 4k+3 prime)/4</code>.
 * @author Sean A. Irvine
 */
public class A022758 extends A022757 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
