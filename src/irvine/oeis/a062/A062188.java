package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A062170.
 * @author Sean A. Irvine
 */
public class A062188 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 1 ? Z.valueOf(n) : a(n - 1).add(a((n - 1) / 2));
  }
}
