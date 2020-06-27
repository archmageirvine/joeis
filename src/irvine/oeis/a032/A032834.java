package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032834 Numbers with digits 3 and 4 only.
 * @author Sean A. Irvine
 */
public class A032834 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(10).add(4)
      : get((n - 1) / 2).multiply(10).add(3);
  }
}
