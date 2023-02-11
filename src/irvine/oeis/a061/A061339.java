package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061339 Minimal number of steps to get from 0 to n by (a) adding 1 or (b) subtracting 1 or (c) multiplying by 2.
 * @author Sean A. Irvine
 */
public class A061339 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.valueOf(n);
    }
    return (n & 1) == 0 ? a(n / 2).add(1) : a(n / 2).add(2).min(a(n / 2 + 1).add(2));
  }
}

