package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005730 Related to n-th powers of polynomials.
 * @author Sean A. Irvine
 */
public class A005730 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.omega() == 1 && fs.bigOmega() == 1) {
      return Z.ONE;
    }
    final Z prod = fs.squareFreeKernel();
    for (long j = 4; 2 * (j - 1) <= mN; j <<= 1) {
      if (mN % (2 * (j - 1)) == 0) {
        return prod.multiply2();
      }
    }
    return prod;
  }
}
