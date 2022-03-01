package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055207 Sum of n-th powers of digits of n.
 * @author Georg Fischer
 */
public class A055207 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long n = mN;
    Z sum = Z.ZERO;
    while (n > 0) {
      sum = sum.add(Z.valueOf(n % 10).pow(mN));
      n /= 10;
    }
    return sum;
  }
}
