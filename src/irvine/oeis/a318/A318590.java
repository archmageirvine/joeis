package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.a054.A054919;
import irvine.oeis.a054.A054921;
import irvine.oeis.memory.MemorySequence;

/**
 * A318590 Number of connected balanced signed graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A318590 extends MemorySequence {

  private final MemorySequence mA054919 = MemorySequence.cachedSequence(new A054919());
  private final MemorySequence mA054921 = MemorySequence.cachedSequence(new A054921());

  @Override
  protected Z computeNext() {
    final int n = size();
    if ((n & 1) == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      return a(n / 2).add(mA054919.a(n / 2)).add(mA054921.a(n)).subtract(mA054921.a(n / 2)).divide2();
    } else {
      return mA054921.a(n).divide2();
    }
  }
}
