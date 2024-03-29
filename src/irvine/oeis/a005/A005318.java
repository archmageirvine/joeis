package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005318 Conway-Guy sequence: a(n + 1) = 2a(n) - a(n - floor( 1/2 + sqrt(2n) )).
 * @author Sean A. Irvine
 */
public class A005318 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    return a(n - 1).multiply2().subtract(a(n - 1 - CR.HALF.add(CR.valueOf(2L * n - 2).sqrt()).floor().intValueExact()));
  }
}
