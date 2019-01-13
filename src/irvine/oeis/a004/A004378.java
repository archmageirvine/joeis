package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004378.
 * @author Sean A. Irvine
 */
public class A004378 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 10);
  }
}

