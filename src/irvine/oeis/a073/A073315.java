package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073315 Expansion of Lambert W function in powers of log(log(x))/log(x).
 * @author Sean A. Irvine
 */
public class A073315 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mM)
      .multiply(Functions.STIRLING1.z(mN, mM).abs())
      .multiply(Binomial.binomial(mN + 1, mM))
      .divide(mN + 1);
  }
}

