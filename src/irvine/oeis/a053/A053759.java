package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A053759 a(n) = a(a(n-6))+a(n-a(n-6)) if n&gt;2 otherwise a(n)=1.
 * @author Sean A. Irvine
 */
public class A053759 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 5) {
      return Z.ONE;
    }
    final int t = get(n - 6).intValueExact();
    return get(t + 3).add(get(n - t));
  }
}
