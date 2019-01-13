package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006755.
 * @author Sean A. Irvine
 */
public class A006755 extends MemorySequence {

  // Conjectural formula

  private static final long[] INITIAL = {0, 2, 3, 4, 8, 14, 25, 47};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < INITIAL.length) {
      return Z.valueOf(INITIAL[n]);
    }
    return get(n - 1).multiply2().subtract(get(n - 1 - (int) Math.floor(0.5 + Math.sqrt(2L * (n - 2)))));
  }
}

