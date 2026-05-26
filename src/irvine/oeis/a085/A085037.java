package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085037 Smallest square divisible by the n-th triangular number (n(n+1)/2).
 * @author Sean A. Irvine
 */
public class A085037 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(Functions.TRIANGULAR.z(++mN));
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow((fs.getExponent(p) + 1) & ~1));
    }
    return prod;
  }
}
