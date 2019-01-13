package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004303.
 * @author Sean A. Irvine
 */
public class A004303 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * (mN - 1), mN - 1).divide(mN).subtract(Z.ONE.shiftLeft(mN - 1)).add(mN);
  }
}

