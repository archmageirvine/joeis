package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032840 Numbers whose set of base 16 digits is <code>{3,4}</code>.
 * @author Sean A. Irvine
 */
public class A032840 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(16).add(4)
      : get((n - 1) / 2).multiply(16).add(3);
  }
}
