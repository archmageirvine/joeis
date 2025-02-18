package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075388 (1/n) times initial term of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075388 extends A075384 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
