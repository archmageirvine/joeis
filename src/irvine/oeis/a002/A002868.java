package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002868 Largest number in n-th row of triangle of Lah numbers (A008297 and <code>A271703)</code>.
 * @author Sean A. Irvine
 */
public class A002868 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ONE;
    for (int m = 1; m <= mN; ++m) {
      res = res.max(mF.factorial(mN).multiply(Binomial.binomial(mN - 1, m - 1)).divide(mF.factorial(m)));
    }
    return res;
  }
}

