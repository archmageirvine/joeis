package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032806 Numbers whose set of base 6 digits is <code>{2,3}</code>.
 * @author Sean A. Irvine
 */
public class A032806 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(6).add(3)
      : get((n - 1) / 2).multiply(6).add(2);
  }
}
