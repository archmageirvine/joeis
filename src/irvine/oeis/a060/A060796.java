package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060796 Upper central divisor of n-th primorial.
 * @author Sean A. Irvine
 */
public class A060796 extends A000040 {

  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    mFactorSequence.add(super.next(), FactorSequence.PRIME);
    final Z[] d = Jaguar.factor(mFactorSequence).divisorsSorted();
    return d[d.length / 2];
  }
}
