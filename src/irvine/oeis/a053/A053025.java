package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053025 Number of iterations of the number of divisors function (A000005) required to reach a fixed point (1 or 2) when started at n!.
 * @author Sean A. Irvine
 */
public class A053025 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    if (mN <= 2) {
      return Z.ONE;
    }
    long cnt = 1;
    FactorSequence fs = mFactorSequence;
    Z s;
    do {
      ++cnt;
      s = fs.sigma0();
      fs = Jaguar.factor(s);
    } while (Z.TWO.compareTo(s) < 0);
    return Z.valueOf(cnt);
  }
}
