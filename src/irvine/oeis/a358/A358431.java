package irvine.oeis.a358;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A358431 a(0) = 1; a(n+1) = 1 if a(n) &gt; n, otherwise a(n+1) = a(n) + a(a(n)).
 * @author Sean A. Irvine
 */
public class A358431 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return a(n - 1).compareTo(Z.valueOf(n - 1)) > 0 ? Z.ONE : a(n - 1).add(a(a(n - 1).intValueExact()));
  }
}
