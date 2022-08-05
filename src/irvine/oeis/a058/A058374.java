package irvine.oeis.a058;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A058374 a(1) = 1; a(n+1) = sum{k=1 to n}[a(k)^a(n+1-k)].
 * @author Sean A. Irvine
 */
public class A058374 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n - 1, k -> get(k).pow(get(n - 1 - k)));
  }
}

