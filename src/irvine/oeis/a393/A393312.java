package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393312 Triangle read by rows: T(n,k) = (n-k-1)! * binomial(n,k) if n+k is odd, else 0.
 * @author Sean A. Irvine
 */
public class A393312 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return ((mN + mM) & 1) == 0 ? Z.ZERO : Binomial.binomial(mN, mM).multiply(Functions.FACTORIAL.z(mN - mM - 1));
  }
}
