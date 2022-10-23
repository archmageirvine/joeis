package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000346 a(n) = 2^(2*n+1) - binomial(2*n+1, n+1).
 * @author Sean A. Irvine
 */
public class A000346 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int t = 2 * ++mN + 1;
    return Z.ONE.shiftLeft(t).subtract(Binomial.binomial(t, mN + 1));
  }
}
