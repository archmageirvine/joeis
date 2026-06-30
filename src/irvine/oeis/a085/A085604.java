package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085589.
 * @author Sean A. Irvine
 */
public class A085604 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mFactorSequence.add(++mN);
      Jaguar.factor(mFactorSequence);
      mM = 0;
    }
    return Z.valueOf(mFactorSequence.getExponent(Functions.PRIME.z(mM + 1)));
  }
}
