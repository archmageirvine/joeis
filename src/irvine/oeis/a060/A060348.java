package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A060348 a(n) = n^n * (n^2 - 1)/24.
 * @author Sean A. Irvine
 */
public class A060348 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).multiply((long) mN * mN - 1).divide(24);
  }
}
