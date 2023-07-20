package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A024741 a(n) = Sum_{i=1..floor((n+1)/4)} a(2*i-1) * a(n-2*i+1), with a(1)=2, a(2)=1, and a(3)=3.
 * @author Sean A. Irvine
 */
public class A024741 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    } else if (n == 1) {
      return Z.ONE;
    } else if (n == 2) {
      return Z.THREE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < (n + 2) / 4; ++k) {
      sum = sum.add(a(2 * k).multiply(a(n - 2 * k - 1)));
    }
    return sum;
  }
}
