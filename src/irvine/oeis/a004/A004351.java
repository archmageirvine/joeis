package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004351 Binomial coefficient C(5*n,n-9).
 * @author Sean A. Irvine
 */
public class A004351 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 9);
  }
}

