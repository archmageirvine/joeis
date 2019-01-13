package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A001800.
 * @author Sean A. Irvine
 */
public class A001800 extends A000120 {

  private long mN = -1;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 2, mN + 1).multiply(mN + 1).shiftRight(super.next().intValue());
  }
}
