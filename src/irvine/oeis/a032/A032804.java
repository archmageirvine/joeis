package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032804 Set of base 4 digits of n is {2,3}.
 * @author Sean A. Irvine
 */
public class A032804 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(4).add(3)
      : get((n - 1) / 2).multiply(4).add(2);
  }
}
