package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032824 Numbers whose set of base 12 digits is {1,4}.
 * @author Sean A. Irvine
 */
public class A032824 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(12).add(4)
      : get((n - 1) / 2).multiply(12).add(1);
  }
}
