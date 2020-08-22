package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004367 Binomial coefficient C(6n,n-12).
 * @author Sean A. Irvine
 */
public class A004367 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 12);
  }
}

