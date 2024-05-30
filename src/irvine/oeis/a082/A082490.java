package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082490 Exponent of highest power of 3 dividing sum(0&lt;=k&lt;n, C(2n,n)).
 * a(n) = valuation(n^2 * binomial(2*n, n), 3);
 * @author Georg Fischer
 */
public class A082490 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A082490() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.VALUATION.z(Binomial.binomial(2L * mN, mN).multiply(mN).multiply(mN), Z.THREE);
  }
}
