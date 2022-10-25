package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050328 Number of ordered factorizations of n into squarefree numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A050328 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d != n && Jaguar.factor(n / d).isSquareFree()) {
        sum = sum.add(a(d));
      }
    }
    return sum;
  }
}

