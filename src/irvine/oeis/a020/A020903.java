package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A020903.
 * @author Sean A. Irvine
 */
public class A020903 extends MemorySequence {

  // After Robert Israel

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    final long t = (LongUtils.sqrt(8L * n + 1) - 1) / 2;
    return get((int) (n + 1 - t * (t + 1) / 2));
  }
}
