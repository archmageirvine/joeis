package irvine.oeis.a358;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A358431 allocated for Aidan Clarke.
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
