package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008297 Triangle of Lah numbers.
 * @author Sean A. Irvine
 */
public class A008297 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Z t = Binomial.binomial(mN - 1, mM - 1).multiply(mF.factorial(mN)).divide(mF.factorial(mM));
    return (mN & 1) == 0 ? t : t.negate();
  }
}
