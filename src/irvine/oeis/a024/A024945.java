package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A024945 <code>a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1)</code>, with <code>a(1)=a(2)=1</code> and <code>a(3)=2</code>.
 * @author Sean A. Irvine
 */
public class A024945 extends MemorySequence {

  {
    add(null);
  }

  protected Z a() {
    return Z.ONE;
  }

  protected Z c() {
    return Z.TWO;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      if (n == 1) {
        return a();
      } else if (n == 2) {
        return Z.ONE;
      } else {
        return c();
      }
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= (n + 2) / 4; ++k) {
      sum = sum.add(get(2 * k - 1).multiply(get(n - 2 * k + 1)));
    }
    return sum;
  }
}
