package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.MemorySequence;

/**
 * A006755 The generalized Conway-Guy sequence w^{1}.
 * @author Sean A. Irvine
 */
public class A006755 extends MemorySequence implements Conjectural {

  private static final long[] INITIAL = {0, 2, 3, 4, 8, 14, 25, 47};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < INITIAL.length) {
      return Z.valueOf(INITIAL[n]);
    }
    return a(n - 1).multiply2().subtract(a(n - 1 - (int) Math.floor(0.5 + Math.sqrt(2L * (n - 2)))));
  }
}

