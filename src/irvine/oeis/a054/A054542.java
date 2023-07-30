package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054542 A Catalan-like sequence.
 * @author Sean A. Irvine
 */
public class A054542 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).add(mN + 1).divide(mN + 2);
  }
}
