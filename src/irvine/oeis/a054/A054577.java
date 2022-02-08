package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054577 A Catalan-like sequence.
 * @author Sean A. Irvine
 */
public class A054577 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).divide(mN + 2);
  }
}
