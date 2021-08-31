package irvine.oeis.a051;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051271 Number of numbers either relatively prime to or divisors of primorial number(n).
 * @author Sean A. Irvine
 */
public class A051271 extends A000040 {

  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    mFactorSequence.add(super.next(), FactorSequence.PRIME);
    return mFactorSequence.phi().add(mFactorSequence.sigma0());
  }
}
