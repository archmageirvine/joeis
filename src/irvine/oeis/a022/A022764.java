package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022764 <code>(n-th 8k+3</code> prime plus <code>n-th 8k+5 prime)/8</code>.
 * @author Sean A. Irvine
 */
public class A022764 extends A022763 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
