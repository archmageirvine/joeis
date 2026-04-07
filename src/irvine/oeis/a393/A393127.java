package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393127 Least m such that 10^A393126(n) - 1 - 10^m is a reversible prime (emirp or palindromic prime).
 * @author Sean A. Irvine
 */
public class A393127 extends Sequence1 {

  private long mN = 0;

  private long is(final long n) {
    final Z r = Z.TEN.pow(n).subtract(1);
    Z mt = Z.ONE;
    for (long m = 1; m < (n + 1) / 2; ++m) {
      mt = mt.multiply(10);
      if (r.subtract(mt).isProbablePrime() && r.subtract(Z.TEN.pow(n - m - 1)).isProbablePrime()) {
        return m;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    while (true) {
      final long m = is(++mN);
      if (m != 0) {
        return Z.valueOf(m);
      }
    }
  }
}
