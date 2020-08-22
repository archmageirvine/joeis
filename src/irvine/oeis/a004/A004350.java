package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004350 Binomial coefficient C(5n,n-8).
 * @author Sean A. Irvine
 */
public class A004350 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 8);
  }
}

