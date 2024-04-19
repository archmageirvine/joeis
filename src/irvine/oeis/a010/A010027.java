package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010027 Triangle read by rows: T(n,k) is the number of permutations of [n] having k consecutive ascending pairs (0 &lt;= k &lt;= n-1).
 * @author Sean A. Irvine
 */
public class A010027 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Z fk = Functions.FACTORIAL.z(mM - 1);
    Z sum = Z.ZERO;
    for (int j = 0; j < mM; ++j) {
      sum = sum.signedAdd(((mM - j) & 1) == 1, fk.multiply(j + 1).divide(Functions.FACTORIAL.z(mM - j - 1)));
    }
    return sum.multiply(Binomial.binomial(mN - 1, mM - 1));
  }
}
