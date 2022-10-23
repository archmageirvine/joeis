package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038208 Triangle whose (i,j)-th entry is binomial(i,j)*2^i.
 * @author Sean A. Irvine
 */
public class A038208 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).shiftLeft(mN);
  }
}
