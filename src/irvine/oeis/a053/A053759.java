package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A053759 a(n) = a(a(n-6))+a(n-a(n-6)) if n&gt;2 otherwise a(n)=1.
 * @author Sean A. Irvine
 */
public class A053759 extends MemorySequence {

  {
    setOffset(-3);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 5) {
      return Z.ONE;
    }
    final int t = a(n - 6).intValueExact();
    return a(t + 3).add(a(n - t));
  }
}
