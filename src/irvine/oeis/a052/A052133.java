package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a002.A002487;

/**
 * A052133 CONTINUANT transform of 0, 1, 1, 2, 1, 3, 2, 3, ... (A002487).
 * @author Sean A. Irvine
 */
public class A052133 extends MemorySequence {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A002487());

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    } else if (n == 1) {
      return Z.ONE;
    }
    return mB.a(n).multiply(a(n - 1)).add(a(n - 2));
  }

  @Override
  public Z a(final int n) {
    return n < 0 ? Z.ZERO : super.a(n);
  }
}
