package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008297 Triangle of Lah numbers.
 * @author Sean A. Irvine
 */
public class A008297 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  protected Z lah(final int n, final int m) {
    final Z t = Binomial.binomial(n - 1, m - 1).multiply(Functions.FACTORIAL.z(n)).divide(Functions.FACTORIAL.z(m));
    return (n & 1) == 0 ? t : t.negate();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return lah(mN, mM);
  }
}
