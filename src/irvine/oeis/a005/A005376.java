package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005376 a(n) = n - a(a(a(a(a(n-1))))).
 * @author Sean A. Irvine
 */
public class A005376 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ZERO : Z.valueOf(n - a(a(a(a(a(n - 1).intValueExact()).intValueExact()).intValueExact()).intValueExact()).intValueExact());
  }
}
