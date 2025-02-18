package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075390 Average of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075390 extends A075386 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
