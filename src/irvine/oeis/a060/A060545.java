package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060545 a(n) = binomial(n^2, n)/n.
 * @author Sean A. Irvine
 */
public class A060545 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN, mN).divide(mN);
  }
}
