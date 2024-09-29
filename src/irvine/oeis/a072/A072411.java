package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072411 LCM of exponents in prime factorization of n, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A072411 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z lcm = Z.ONE;
    for (final Z p : fs.toZArray()) {
      lcm = lcm.lcm(fs.getExponent(p));
    }
    return lcm;
  }
}
