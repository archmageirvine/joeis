package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006976.
 * @author Sean A. Irvine
 */
public class A006976 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 5, 5).multiply(mN + 12).shiftLeft(mN).divide(12);
  }
}
