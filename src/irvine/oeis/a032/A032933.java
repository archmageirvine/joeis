package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032933 Numbers whose set of base-13 digits is {1,2}.
 * @author Sean A. Irvine
 */
public class A032933 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(13).add(2)
      : a((n - 1) / 2).multiply(13).add(1);
  }
}
