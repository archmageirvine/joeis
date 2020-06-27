package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032816 Numbers whose set of base 16 digits is <code>{2,3}</code>.
 * @author Sean A. Irvine
 */
public class A032816 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(16).add(3)
      : get((n - 1) / 2).multiply(16).add(2);
  }
}
