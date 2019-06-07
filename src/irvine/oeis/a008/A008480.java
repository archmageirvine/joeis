package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008480 Number of ordered prime factorizations of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A008480 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum = sum.add(e);
      prod = prod.multiply(mF.factorial(e));
    }
    return mF.factorial(sum.intValueExact()).divide(prod);
  }
}
