package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A004357 a(n) = binomial(6*n,n-2).
 * @author Sean A. Irvine
 */
public class A004357 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 2);
  }
}

