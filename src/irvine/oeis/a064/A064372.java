package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064372 Additive function a(n) defined by the recursive formula a(1)=1 and a(p^k)=a(k) for any prime p.
 * @author Sean A. Irvine
 */
public class A064372 extends MemorySequence {

  {
    add(null);
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(a(fs.getExponent(p)));
    }
    return sum;
  }
}
