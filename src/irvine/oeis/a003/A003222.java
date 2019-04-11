package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003222 <code>a(n) = 2^(3*n+1) - 2*n*(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A003222 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3 * mN + 1).subtract(Z.valueOf(2L * mN).multiply(2 * mN + 1));
  }
}
