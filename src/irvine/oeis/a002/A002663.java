package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002663.
 * @author Sean A. Irvine
 */
public class A002663 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 1).subtract(Binomial.binomial(mN, 2)).subtract(Binomial.binomial(mN, 3));
  }
}
