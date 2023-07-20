package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A053756 a(n)=a(a(n-3))+a(n-a(n-3)) if n&gt;2 otherwise a(n)=1.
 * @author Sean A. Irvine
 */
public class A053756 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    final int t = a(n - 3).intValueExact();
    return a(t).add(a(n - t));
  }
}
