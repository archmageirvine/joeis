package irvine.oeis.a051;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051272 Number of numbers neither relatively prime to nor divisors of primorial number(n).
 * @author Sean A. Irvine
 */
public class A051272 extends A000040 {

  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    mFactorSequence.add(super.next(), FactorSequence.PRIME);
    return mFactorSequence.product().subtract(mFactorSequence.phi()).subtract(mFactorSequence.sigma0()).add(1);
  }
}
