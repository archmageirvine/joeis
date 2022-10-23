package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013981 Number of commutative elements in Coxeter group H_n.
 * @author Sean A. Irvine
 */
public class A013981 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN + 2, mN + 1).subtract(Z.ONE.shiftLeft(mN + 2)).add(mN + 3);
  }
}
