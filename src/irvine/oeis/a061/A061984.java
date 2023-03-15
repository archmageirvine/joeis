package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061984 a(n) = 1 + a([n/2]) + a([n/3]) with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A061984 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ZERO : a(n / 2).add(a(n / 3)).add(1);
  }
}
