package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075391 Product/n^n of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075391 extends A075387 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(Z.valueOf(++mN).pow(mN));
  }
}
