package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032930 Numbers whose set of base-9 digits is {1,2}.
 * @author Sean A. Irvine
 */
public class A032930 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(9).add(2)
      : a((n - 1) / 2).multiply(9).add(1);
  }
}
