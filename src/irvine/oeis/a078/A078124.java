package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078124 Second column, M(n+1,1) for n&gt;=0, of infinite lower triangular matrix M defined in A078122.
 * @author Sean A. Irvine
 */
public class A078124 extends A078122 {

  private int mN = 0;

  @Override
  public Z next() {
    return mB.get(++mN, 1);
  }
}

