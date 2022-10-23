package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A004370 Binomial coefficient C(7n,n-2).
 * @author Sean A. Irvine
 */
public class A004370 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 2);
  }
}

