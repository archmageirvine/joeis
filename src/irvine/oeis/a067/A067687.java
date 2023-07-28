package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;
import irvine.oeis.memory.MemorySequence;

/**
 * A067687 Expansion of 1/( 1 - x / Product_{n&gt;=1} (1-x^n) ).
 * <code>a(n) = Sum_{k=1..n} A000041(k-1)*a(n-k)</code>
 * @author Georg Fischer
 */
public class A067687 extends MemorySequence {

  private int mN = -1;
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A000041());

  @Override
  public Z computeNext() {
    ++mN;
    return (mN == 0) ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> mSeq.a(k - 1).multiply(a(mN - k)));
  }
}
