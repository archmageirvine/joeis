package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004368 Binomial coefficient C(7n,n).
 * @author Sean A. Irvine
 */
public class A004368 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN);
  }
}

