package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080084 Number of prime factors in the factorial of the n-th prime, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A080084 extends A000040 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mM = 1;

  @Override
  public Z next() {
    final long p = super.next().longValue();
    while (mM <= p) {
      mFactorSequence.add(mM++);
    }
    Jaguar.factor(mFactorSequence);
    return Z.valueOf(mFactorSequence.bigOmega());
  }
}

