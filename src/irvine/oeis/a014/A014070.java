package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014070 a(n) = binomial(2^n, n).
 * @author Sean A. Irvine
 */
public class A014070 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(1L << ++mN, mN);
  }
}
