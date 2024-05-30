package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A063683 Integers formed from the reduced residue sets of even numbers and Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A063683 extends Sequence1 {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sum = sum.add(mF.a(k));
      }
    }
    return sum;
  }
}
