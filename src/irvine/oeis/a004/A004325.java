package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004325 Binomial coefficient C(3n,n-7).
 * @author Sean A. Irvine
 */
public class A004325 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 7);
  }
}

