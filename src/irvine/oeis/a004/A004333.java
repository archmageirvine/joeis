package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A004333 Binomial coefficient C(4n,n-3).
 * @author Sean A. Irvine
 */
public class A004333 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 3);
  }
}

