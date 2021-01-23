package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004347 Binomial coefficient C(5n,n-5).
 * @author Sean A. Irvine
 */
public class A004347 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 5);
  }
}

