package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004331 Binomial coefficient C(4n,n-1).
 * @author Sean A. Irvine
 */
public class A004331 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 1);
  }
}

