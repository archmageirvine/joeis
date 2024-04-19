package irvine.oeis.a036;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036064 Triangle of flag coefficients [ n k ] (numerators of rational parts).
 * @author Sean A. Irvine
 */
public class A036064 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if ((mN & 1) == 0) {
      if ((mM & 1) == 0) {
        return select(new Q(Binomial.binomial(mN, mM), Binomial.binomial(mN / 2, mM / 2)));
      } else {
        return select(new Q(Functions.FACTORIAL.z(mN), Functions.FACTORIAL.z(mM / 2).multiply(Functions.FACTORIAL.z(mN / 2)).multiply(Functions.FACTORIAL.z(mN / 2 - mM / 2 - 1)).shiftLeft(mN)));
      }
    } else {
      if ((mM & 1) == 0) {
        return select(new Q(Binomial.binomial(mN / 2, mM / 2).shiftLeft(mM), Binomial.binomial(mM, mM / 2)));
      } else {
        return select(new Q(Binomial.binomial(mN / 2, mM / 2).shiftLeft(mN - mM), Binomial.binomial(mN - mM, mN / 2 - mM / 2)));
      }
    }
  }
}
