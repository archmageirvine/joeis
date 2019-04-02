package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004380 Binomial coefficient C(7n,n-12).
 * @author Sean A. Irvine
 */
public class A004380 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 12);
  }
}

