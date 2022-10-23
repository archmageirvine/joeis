package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053731 a(n) = ceiling(binomial(n,8)/n).
 * @author Sean A. Irvine
 */
public class A053731 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 8).add(mN - 1).divide(mN);
  }
}
