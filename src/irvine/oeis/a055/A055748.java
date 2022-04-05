package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A055748 A chaotic cousin of the Hofstadter-Conway sequence A004001.
 * @author Sean A. Irvine
 */
public class A055748 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 1 ? Z.ONE : get(get(n - 1).intValueExact() - 1).add(get(n - 1 - get(n - 2).intValueExact()));
  }
}
