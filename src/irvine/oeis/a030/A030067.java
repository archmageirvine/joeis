package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030067 The "Semi-Fibonacci sequence": a(1) = 1; a(n) = a(n/2) (n even); a(n) = a(n-1) + a(n-2) (n odd).
 * @author Sean A. Irvine
 */
public class A030067 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if ((n & 1) == 0) {
      return a(n / 2);
    }
    return a(n - 1).add(a(n - 2));
  }
}
