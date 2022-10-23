package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004381 Binomial coefficient C(8n,n).
 * @author Sean A. Irvine
 */
public class A004381 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN);
  }
}

