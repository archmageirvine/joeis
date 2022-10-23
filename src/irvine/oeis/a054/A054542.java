package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054542 A Catalan-like sequence.
 * @author Sean A. Irvine
 */
public class A054542 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).add(mN + 1).divide(mN + 2);
  }
}
