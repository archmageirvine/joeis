package irvine.oeis.a004;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A004208 a(n) = n * (2*n - 1)!! - Sum_{k=0..n-1} a(k) * (2*n - 2*k - 1)!!.
 * @author Sean A. Irvine
 */
public class A004208 extends MemorySequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z t = Functions.MULTIFACTORIAL.z(2 * n - 1).multiply(n);
    for (int k = 1; k < n; ++k) {
      t = t.subtract(a(k).multiply(Functions.MULTIFACTORIAL.z(2 * n - 2 * k - 1)));
    }
    return t;
  }
}
