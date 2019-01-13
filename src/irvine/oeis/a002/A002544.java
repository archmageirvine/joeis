package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002544.
 * @author Sean A. Irvine
 */
public class A002544 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 1, mN).multiply(Z.valueOf(mN + 1).square());
  }
}
