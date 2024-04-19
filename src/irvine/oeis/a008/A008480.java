package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008480 Number of ordered prime factorizations of n.
 * @author Sean A. Irvine
 */
public class A008480 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum = sum.add(e);
      prod = prod.multiply(Functions.FACTORIAL.z(e));
    }
    return Functions.FACTORIAL.z(sum).divide(prod);
  }
}
