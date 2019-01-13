package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004001.
 * @author Sean A. Irvine
 */
public class A004001 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    } else {
      final int m = get(n - 1).intValueExact();
      return get(m - 1).add(get(n - m));
    }
  }
}

