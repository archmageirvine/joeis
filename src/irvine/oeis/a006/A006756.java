package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.memory.MemorySequence;

/**
 * A006756 The generalized Conway-Guy sequence w^{2}.
 * @author Sean A. Irvine
 */
public class A006756 extends MemorySequence implements Conjectural {

  private static final long[] INITIAL = {0, 4, 5, 6, 8, 16, 27, 49, 92};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < INITIAL.length) {
      return Z.valueOf(INITIAL[n]);
    }
    return a(n - 1).multiply2().subtract(a(n - 1 - (int) Math.floor(0.5 + Math.sqrt(2L * (n - 3)))));
  }
}

