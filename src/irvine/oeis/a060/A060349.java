package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A060349 a(n) = n^(n+2)*(n^2 - 1)*(n+3)*(n+2)*(5*n - 7)/5760.
 * @author Sean A. Irvine
 */
public class A060349 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 2).multiply((long) mN * mN - 1).multiply(mN + 3).multiply(mN + 2).multiply(5L * mN - 7).divide(5760);
  }
}
