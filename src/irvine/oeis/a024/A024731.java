package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A024731 <code>a(n) = Sum_{i=1..floor((n+1)/4)} a(2*i-1) * a(n-2*i+1)</code>, with <code>a(1)=a(2)=1</code> and <code>a(3)=6</code>.
 * @author Sean A. Irvine
 */
public class A024731 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    } else if (n < 4) {
      return Z.SIX;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < (n + 2) / 4; ++k) {
      sum = sum.add(get(2 * k).multiply(get(n - 2 * k - 1)));
    }
    return sum;
  }
}
