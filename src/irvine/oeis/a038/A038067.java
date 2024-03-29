package irvine.oeis.a038;
// manually 2020-12-30

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A038067 Product_{k&gt;=1} (1 + x^k)^a(k) = 1 + 2x.
 * Dirichlet convolution of A038063 with the characteristic function of powers of 2 (A209229).
 * @author Georg Fischer
 */
public class A038067 extends Sequence1 {

  protected MemorySequence mSeq = MemorySequence.cachedSequence(new A038063());
  protected int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mSeq.a(mN / d - 1).multiply(Z.valueOf(d).bitCount() == 1 ? Z.ONE : Z.ZERO));
    }
    return sum;
  }
}
