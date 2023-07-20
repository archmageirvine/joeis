package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006997 Partitioning integers to avoid arithmetic progressions of length 3.
 * @author Sean A. Irvine
 */
public class A006997 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return a(n / 3).multiply(3).add(n % 3).divide2();
  }
}
