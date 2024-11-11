package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073039 First multiple of n in A025487.
 * @author Sean A. Irvine
 */
public class A073039 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.lcm(Functions.PRIMORIAL.z(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
