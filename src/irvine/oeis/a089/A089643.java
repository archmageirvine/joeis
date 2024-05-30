package irvine.oeis.a089;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A089643 3^a(n) divides C(3n,n); 3-adic valuation of A005809.
 * a(n)=valuation(binomial(3*n,n), 3).
 * @author Georg Fischer
 */
public class A089643 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.VALUATION.z(Binomial.binomial(3L * mN, mN), Z.THREE);
  }
}
