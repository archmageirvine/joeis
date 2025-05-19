package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077389 Smallest integer that is the average of n consecutive primes.
 * @author Sean A. Irvine
 */
public class A077389 extends A077388 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
