package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075630 (1/n) times sum of terms of n-th group in A075626.
 * @author Sean A. Irvine
 */
public class A075630 extends A075629 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
