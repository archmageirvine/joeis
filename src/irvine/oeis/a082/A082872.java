package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082872 a^n + b^n + c^n + ..., where a*b*c* ... is the prime factorization of n.
 * @author Sean A. Irvine
 */
public class A082872 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p.pow(mN).multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
