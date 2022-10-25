package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006998 Partitioning integers to avoid arithmetic progressions of length 3.
 * @author Sean A. Irvine
 */
public class A006998 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    return a(2 * n / 3).add(a((2 * n + 1) / 3));
  }
}
