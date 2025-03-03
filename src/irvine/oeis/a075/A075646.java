package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075646 (Sum of n-th group in A075643)/(n+1).
 * @author Sean A. Irvine
 */
public class A075646 extends A075645 {

  private int mN = 1;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
