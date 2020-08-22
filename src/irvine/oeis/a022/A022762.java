package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022762 (n-th 8k+1 prime plus n-th 8k+7 prime)/8.
 * @author Sean A. Irvine
 */
public class A022762 extends A022761 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
