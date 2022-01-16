package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A053758 a(n) = a(a(n-5))+a(n-a(n-5)) if n&gt;2 otherwise a(n)=1.
 * @author Sean A. Irvine
 */
public class A053758 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.ONE;
    }
    final int t = get(n - 5).intValueExact();
    return get(t + 2).add(get(n - t));
  }
}
