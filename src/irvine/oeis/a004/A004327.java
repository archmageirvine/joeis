package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004327 Binomial coefficient C(3n,n-9).
 * @author Sean A. Irvine
 */
public class A004327 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 9);
  }
}

