package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032827 Numbers whose set of base-15 digits is {1,4}.
 * @author Sean A. Irvine
 */
public class A032827 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(15).add(4)
      : a((n - 1) / 2).multiply(15).add(1);
  }
}
