package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001142.
 * @author Sean A. Irvine
 */
public class A001142 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Binomial.binomial(mN, k));
    }
    return p;
  }
}
