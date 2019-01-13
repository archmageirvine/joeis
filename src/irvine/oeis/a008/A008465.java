package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008465.
 * @author Sean A. Irvine
 */
public class A008465 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 3).shiftLeft(2 * mN - 6).subtract(Binomial.binomial(mN, 4).shiftLeft(mN - 2));
  }
}
