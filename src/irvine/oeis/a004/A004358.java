package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A004358 Binomial coefficient C(6n,n-3).
 * @author Sean A. Irvine
 */
public class A004358 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 3);
  }
}

