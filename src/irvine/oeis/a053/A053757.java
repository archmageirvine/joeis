package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A053757 a(n) = a(a(n-4))+a(n-a(n-4)) if n&gt;2 otherwise a(n)=1.
 * @author Sean A. Irvine
 */
public class A053757 extends MemorySequence {

  {
    setOffset(-1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    }
    final int t = a(n - 4).intValueExact();
    return a(t + 1).add(a(n - t));
  }
}
