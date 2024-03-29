package irvine.oeis.a058;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A058374 a(1) = 1; a(n+1) = sum{k=1 to n}[a(k)^a(n+1-k)].
 * @author Sean A. Irvine
 */
public class A058374 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n - 1, k -> a(k).pow(a(n - 1 - k)));
  }
}

