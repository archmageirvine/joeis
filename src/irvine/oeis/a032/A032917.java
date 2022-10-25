package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032917 Numbers having only digits 1 and 3 in their decimal representation.
 * @author Sean A. Irvine
 */
public class A032917 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(10).add(3)
      : a((n - 1) / 2).multiply(10).add(1);
  }
}
