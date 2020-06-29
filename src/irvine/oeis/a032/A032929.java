package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032929 Numbers whose set of base 8 digits is <code>{1,2}</code>.
 * @author Sean A. Irvine
 */
public class A032929 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(8).add(2)
      : get((n - 1) / 2).multiply(8).add(1);
  }
}
