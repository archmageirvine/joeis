package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074190 Let the index of the largest prime power that divides n! be k then the smallest number such that n!*a(n) is a perfect k-th power.
 * @author Sean A. Irvine
 */
public class A074190 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    final Z f = Functions.FACTORIAL.z(mN);
    final FactorSequence fs = Jaguar.factor(f);
    return fs.squareFreeKernel().pow(fs.getExponent(Z.TWO)).divide(f);
  }
}
