package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007302 Optimal cost function between two processors at distance n.
 * @author Sean A. Irvine
 */
public class A007302 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    final int n = size();
    return (n & 1) == 0 ? a(n / 2) : a((n + 1) / 4).add(1);
  }
}
