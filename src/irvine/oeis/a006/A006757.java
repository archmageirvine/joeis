package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.memory.MemorySequence;

/**
 * A006757 The generalized Conway-Guy sequence w^{3}.
 * @author Sean A. Irvine
 */
public class A006757 extends MemorySequence implements Conjectural {

  private static final long[] INITIAL = {0, 8, 10, 11, 12, 16, 32, 54, 97, 183};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < INITIAL.length) {
      return Z.valueOf(INITIAL[n]);
    }
    return a(n - 1).multiply2().subtract(a(n - 1 - (int) Math.floor(0.5 + Math.sqrt(2L * (n - 4)))));
  }
}

