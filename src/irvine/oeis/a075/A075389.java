package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075389 (1/n) times final term of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075389 extends A075385 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
