package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022762 <code>(n-th 8k+1</code> prime plus <code>n-th 8k+7 prime)/8</code>.
 * @author Sean A. Irvine
 */
public class A022762 extends A022761 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
