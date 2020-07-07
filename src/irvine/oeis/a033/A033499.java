package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033499 <code>a(n) = a(n-1) + a(round(2*(n-1)/3)) + a(round((n-1)/3))</code> with <code>a(1)=a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A033499 extends MemorySequence {

  {
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.ONE : get(n - 1).add(get((2 * n - 1) / 3)).add(get(n / 3));
  }
}

