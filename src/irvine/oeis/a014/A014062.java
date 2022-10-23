package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014062 a(n) = binomial(n^2, n).
 * @author Sean A. Irvine
 */
public class A014062 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN, mN);
  }
}
