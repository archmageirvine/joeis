package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385334 Cat number of complete graphs on n vertices.
 * @author Gregory Morse
 */
public class A385334 extends Sequence1 {
  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    Z sum = Z.ZERO;
    while (n > 3) {
      final long k = n / 2;
      n -= k;
      sum = sum.add(Z.valueOf(k).multiply(n));
    }
    return sum.add(n - 1);
  }
}
