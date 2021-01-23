package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A023183 a(n) = least k such that Fibonacci(k) ends with n, or -1 if there are none.
 * @author Sean A. Irvine
 */
public class A023183 implements Sequence {

  private long mN = -1;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    final Sequence fibo = new A000045();
    long k = 0;
    while (fibo.next().mod(mM) != mN) {
      ++k;
    }
    return Z.valueOf(k);
  }
}

