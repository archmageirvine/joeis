package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052183 A second-order recursive sequence.
 * @author Sean A. Irvine
 */
public class A052183 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN).multiply(mN + 2).divide(2 * mN + 1);
  }
}

