package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007588 Stella octangula numbers: a(n) = n*(2*n^2 - 1).
 * @author Sean A. Irvine
 */
public class A007588 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(2 * mN).subtract(1).multiply(mN);
  }
}
