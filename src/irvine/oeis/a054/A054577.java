package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054577 A Catalan-like sequence.
 * @author Sean A. Irvine
 */
public class A054577 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).divide(mN + 2);
  }
}
