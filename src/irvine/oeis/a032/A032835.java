package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032835 Numbers whose set of base-11 digits is {3,4}.
 * @author Sean A. Irvine
 */
public class A032835 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(11).add(4)
      : get((n - 1) / 2).multiply(11).add(3);
  }
}
