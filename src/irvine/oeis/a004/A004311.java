package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004311 Binomial coefficient C(2n,n-5).
 * @author Sean A. Irvine
 */
public class A004311 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 5);
  }
}

