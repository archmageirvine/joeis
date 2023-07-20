package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A043328 a(0)=1; a(1)=1; a(n)= a(n-1) + floor(sqrt(a(n-1)*a(n-2))) + floor(sqrt(a(n-3)*a(n-4))) + ....
 * @author Sean A. Irvine
 */
public class A043328 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = a(n - 1);
    for (int k = n - 1; k > 0; k -= 2) {
      sum = sum.add(a(k).multiply(a(k - 1)).sqrt());
    }
    return sum;
  }
}
