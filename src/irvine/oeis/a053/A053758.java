package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A053758 a(n) = a(a(n-5))+a(n-a(n-5)) if n&gt;2 otherwise a(n)=1.
 * @author Sean A. Irvine
 */
public class A053758 extends MemorySequence {

  {
    setOffset(-2);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.ONE;
    }
    final int t = a(n - 5).intValueExact();
    return a(t + 2).add(a(n - t));
  }
}
