package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032836 Numbers whose set of base-12 digits is {3,4}.
 * @author Sean A. Irvine
 */
public class A032836 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(12).add(4)
      : a((n - 1) / 2).multiply(12).add(3);
  }
}
