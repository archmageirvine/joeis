package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002664.
 * @author Sean A. Irvine
 */
public class A002664 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 1).subtract(Binomial.binomial(mN, 2)).subtract(Binomial.binomial(mN, 3)).subtract(Binomial.binomial(mN, 4));
  }
}
