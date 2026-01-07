package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390574 Numbers for which the square of its largest prime factor equals the sum of the squares of its other prime factors.
 * @author Sean A. Irvine
 */
public class A390574 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sum = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.square().multiply(fs.getExponent(p)));
      }
      if (sum.equals(Functions.GPF.z(mN).square().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
