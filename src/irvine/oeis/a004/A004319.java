package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004319 a(n) = binomial(3*n, n - 1).
 * @author Sean A. Irvine
 */
public class A004319 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 1);
  }
}

