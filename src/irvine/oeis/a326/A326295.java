package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A326295 a(n) = decimal concatenation of n,a(n-1),a(n-2),...,a(1).
 * @author Sean A. Irvine
 */
public class A326295 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final StringBuilder sb = new StringBuilder();
    sb.append(n + 1);
    for (int k = n - 1; k >= 0; --k) {
      sb.append(a(k));
    }
    return new Z(sb);
  }
}
