package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A062188 a(n+1) = a(n) + a(floor(n/2)), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A062188 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 1 ? Z.valueOf(n) : a(n - 1).add(a((n - 1) / 2));
  }
}
