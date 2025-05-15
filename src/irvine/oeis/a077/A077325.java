package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077325 Average of terms of n-th row of A077321.
 * @author Sean A. Irvine
 */
public class A077325 extends A077324 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
