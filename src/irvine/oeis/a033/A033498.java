package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033498 a(n) = a(n-1)+ a(round(2*(n-1)/3)) +a(round((n-1)/3)) starting a(1)=1.
 * @author Sean A. Irvine
 */
public class A033498 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 1 ? Z.ONE : get(n - 1).add(get((2 * n - 1) / 3)).add(get(n / 3));
  }
}

