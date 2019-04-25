package irvine.oeis.a004;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004208 <code>a(n) = n * (2*n - 1)!! - Sum_{k=0..n-1} a(k) * (2*n - 2*k - 1)!!</code>.
 * @author Sean A. Irvine
 */
public class A004208 extends MemorySequence {

  private final MemoryFactorial mF = new MemoryFactorial();

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z t = mF.doubleFactorial(2 * n - 1).multiply(n);
    for (int k = 1; k < n; ++k) {
      t = t.subtract(get(k).multiply(mF.doubleFactorial(2 * n - 2 * k - 1)));
    }
    return t;
  }
}
