package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081132 a(n) = (n+1)^n*binomial(n+2,2).
 * @author Georg Fischer
 */
public class A081132 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 2, 2).multiply(Z.valueOf(mN + 1).pow(mN));
  }
}
