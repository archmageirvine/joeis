package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032832 Numbers whose set of base-8 digits is {3,4}.
 * @author Sean A. Irvine
 */
public class A032832 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(8).add(4)
      : a((n - 1) / 2).multiply(8).add(3);
  }
}
