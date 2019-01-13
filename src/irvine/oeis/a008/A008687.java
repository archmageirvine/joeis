package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008687.
 * @author Sean A. Irvine
 */
public class A008687 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 1 ? Z.valueOf(n) : get((n & 1) + n / 2).add(n & 1);
  }
}
