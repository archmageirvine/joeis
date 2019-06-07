package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007302 Optimal cost function between two processors at distance <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007302 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ZERO;
    }
    final int n = size();
    return (n & 1) == 0 ? get(n / 2) : get((n + 1) / 4).add(1);
  }
}
