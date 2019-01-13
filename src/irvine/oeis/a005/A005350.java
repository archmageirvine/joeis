package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005350.
 * @author Sean A. Irvine
 */
public class A005350 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int prev = get(n - 1).intValueExact();
    return n <= 3 ? Z.ONE : get(prev).add(get(n - prev));
  }
}

