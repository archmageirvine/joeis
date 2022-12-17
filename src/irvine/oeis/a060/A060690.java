package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060690 a(n) = binomial(2^n + n - 1, n).
 * @author Sean A. Irvine
 */
public class A060690 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(Z.ONE.shiftLeft(++mN).add(mN - 1), Z.valueOf(mN));
  }
}
