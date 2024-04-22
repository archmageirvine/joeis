package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A062537 Nodes in riff (rooted index-functional forest) for n.
 * @author Sean A. Irvine
 */
public class A062537 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(a((int) Functions.PRIME_PI.l(p))).add(a(fs.getExponent(p)).add(1));
    }
    return sum;
  }
}
