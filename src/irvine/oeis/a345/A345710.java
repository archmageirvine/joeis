package irvine.oeis.a345;

import irvine.math.z.Z;

/**
 * A345710 Triangle read by rows in which T(n,k) is half the number of n-bit words with maximum overlap k, n &gt;= 1, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A345710 extends A345530 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
