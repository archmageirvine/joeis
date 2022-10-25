package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032806 Numbers whose set of base-6 digits is {2,3}.
 * @author Sean A. Irvine
 */
public class A032806 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? a(n / 2 - 1).multiply(6).add(3)
      : a((n - 1) / 2).multiply(6).add(2);
  }
}
