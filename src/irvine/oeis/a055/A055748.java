package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A055748 A chaotic cousin of the Hofstadter-Conway sequence A004001.
 * @author Sean A. Irvine
 */
public class A055748 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 1 ? Z.ONE : a(a(n - 1).intValueExact() - 1).add(a(n - 1 - a(n - 2).intValueExact()));
  }
}
