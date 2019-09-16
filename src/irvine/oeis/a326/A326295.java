package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A326295 <code>a(n) =</code> decimal concatenation of <code>n,a(n-1),a(n-2),...,a(1)</code>.
 * @author Sean A. Irvine
 */
public class A326295 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final StringBuilder sb = new StringBuilder();
    sb.append(n + 1);
    for (int k = n - 1; k >= 0; --k) {
      sb.append(get(k));
    }
    return new Z(sb);
  }
}
