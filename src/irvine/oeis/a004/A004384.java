package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A004384 Binomial coefficient C(8n,n-3).
 * @author Sean A. Irvine
 */
public class A004384 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 3);
  }
}

