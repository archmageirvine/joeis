package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A007724 Even minus odd extensions of truncated 3 X 2n grid diagram.
 * @author Sean A. Irvine
 */
public class A007724 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.multinomial(3 * mN, mN - 1, mN, mN + 1).divide(mN).divide(2L * mN - 1).divide(2L * mN + 1);
  }
}
