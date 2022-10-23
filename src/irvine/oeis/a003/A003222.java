package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003222 a(n) = 2^(3*n+1) - 2*n*(2*n+1).
 * @author Sean A. Irvine
 */
public class A003222 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3 * mN + 1).subtract(Z.valueOf(2L * mN).multiply(2 * mN + 1));
  }
}
