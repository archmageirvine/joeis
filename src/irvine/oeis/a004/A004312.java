package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004312 Binomial coefficient C(2n,n-6).
 * @author Sean A. Irvine
 */
public class A004312 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 6);
  }
}

