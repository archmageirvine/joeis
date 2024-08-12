package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071779 Smallest k &gt; n such that F(n) + F(i) divides F(k) + F(i) 1&lt;=i&lt;=n and where F(n) are the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A071779 extends Sequence1 {

  private int mN = 0;

  private boolean is(final Z fn, final Z fk, final int n) {
    for (int i = 1; i <= n; ++i) {
      final Z fi = Functions.FIBONACCI.z(i);
      if (!fk.add(fi).mod(fn.add(fi)).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z fn = Functions.FIBONACCI.z(++mN);
    long k = mN;
    while (true) {
      final Z fk = Functions.FIBONACCI.z(++k);
      if (is(fn, fk, mN)) {
        return Z.valueOf(k);
      }
    }
  }
}
