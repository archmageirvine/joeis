package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077319 Average of terms in n-th row of A077316.
 * @author Sean A. Irvine
 */
public class A077319 extends A077318 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
