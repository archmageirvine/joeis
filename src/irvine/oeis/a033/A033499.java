package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033499 a(n) = a(n-1) + a(round(2*(n-1)/3)) + a(round((n-1)/3)) with a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A033499 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.ONE : a(n - 1).add(a((2 * n - 1) / 3)).add(a(n / 3));
  }
}

