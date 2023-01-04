package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060777 Larger central (or median) divisor of n!.
 * @author Sean A. Irvine
 */
public class A060777 extends Sequence1 {

  private long mN = 0;
  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    mFactorSequence.add(++mN, FactorSequence.UNKNOWN);
    final Z[] d = Jaguar.factor(mFactorSequence).divisorsSorted();
    return d[d.length / 2];
  }
}
