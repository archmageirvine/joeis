package irvine.oeis.a119;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A119259 Central terms of the triangle in A119258.
 * @author Sean A. Irvine
 */
public class A119259 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN + k - 1, k).shiftLeft(k));
    }
    return s;
  }
}

