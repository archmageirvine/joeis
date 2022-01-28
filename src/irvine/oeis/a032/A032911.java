package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032911 Numbers whose set of base-4 digits is a subset of {1,3}.
 * @author Sean A. Irvine
 */
public class A032911 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(4).add(3)
      : get((n - 1) / 2).multiply(4).add(1);
  }
}
