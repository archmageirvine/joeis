package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032924 Numbers whose ternary expansion contains no 0.
 * @author Sean A. Irvine
 */
public class A032924 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(3).add(2)
      : a((n - 1) / 2).multiply(3).add(1);
  }
}
