package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032918 Numbers whose set of base-11 digits is {1,3}.
 * @author Sean A. Irvine
 */
public class A032918 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(11).add(3)
      : a((n - 1) / 2).multiply(11).add(1);
  }
}
