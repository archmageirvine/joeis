package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003467.
 * @author Sean A. Irvine
 */
public class A003467 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.FIVE;
    }
    return Binomial.binomial(mN, 3).multiply(Z.ONE.shiftLeft(2 * mN - 6).add(3));
  }
}
