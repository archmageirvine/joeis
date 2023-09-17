package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065805 a(n) = Sum_{j=0..n} sigma(j,n).
 * @author Sean A. Irvine
 */
public class A065805 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Integers.SINGLETON.sum(0, mN, fs::sigma);
  }
}
