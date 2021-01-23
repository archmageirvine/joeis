package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A038135 Pseudo Q-numbers.
 * @author Sean A. Irvine
 */
public class A038135 extends MemorySequence {

  @Override
  public Z a(final int n) {
    return n > size() ? Z.ZERO : super.a(n);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    } else if (n < 4) {
      return Z.ONE;
    } else {
      return a(Math.abs(n - a(n - 1).intValueExact()))
        .add(a(Math.abs(n - a(n - 2).intValueExact())))
        .add(a(Math.abs(n - a(n - 3).intValueExact())));
    }
  }
}
