package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032931 Numbers whose set of base-11 digits is {1,2}.
 * @author Sean A. Irvine
 */
public class A032931 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(11).add(2)
      : get((n - 1) / 2).multiply(11).add(1);
  }
}
