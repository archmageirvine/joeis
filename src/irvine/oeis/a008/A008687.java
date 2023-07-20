package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A008687 Number of 1's in 2's complement representation of -n.
 * @author Sean A. Irvine
 */
public class A008687 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 1 ? Z.valueOf(n) : a((n & 1) + n / 2).add(n & 1);
  }
}
