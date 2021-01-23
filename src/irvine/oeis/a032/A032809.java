package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032809 Numbers whose set of base 9 digits is {2,3}.
 * @author Sean A. Irvine
 */
public class A032809 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(9).add(3)
      : get((n - 1) / 2).multiply(9).add(2);
  }
}
