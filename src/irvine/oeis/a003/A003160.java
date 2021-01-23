package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003160 a(1) = a(2) = 1, a(n) = n-a(a(n-1))-a(a(n-2)).
 * @author Sean A. Irvine
 */
public class A003160 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    return Z.valueOf(n).subtract(get(get(n - 1).intValueExact())).subtract(get(get(n - 2).intValueExact()));
  }
}
