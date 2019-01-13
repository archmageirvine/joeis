package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006165.
 * @author Sean A. Irvine
 */
public class A006165 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    return (n & 1) == 1 ? get(n / 2).multiply(2) : get(n / 2).add(get(n / 2 - 1));
  }
}

