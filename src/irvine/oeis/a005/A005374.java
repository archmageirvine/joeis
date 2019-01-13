package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005374.
 * @author Sean A. Irvine
 */
public class A005374 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ZERO : Z.valueOf(n - get(get(get(n - 1).intValueExact()).intValueExact()).intValueExact());
  }
}
