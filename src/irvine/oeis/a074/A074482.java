package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074482 Consider the recursion b(1,n) = 1, b(k+1,n) = b(k,n) + (b(k,n) reduced mod(k+n)); then there is a number x such that b(k,n) - b(k-1,n) is a constant x depending only on n, for k &gt; y = A074483(n). Sequence gives values of x.
 * @author Sean A. Irvine
 */
public class A074482 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.valueOf(97);
    }
    Z a = Z.ONE;
    Z x = Z.ZERO;
    long k = 1;
    while (true) {
      final Z ox = x;
      final Z t = a;
      a = a.add(a.mod(mN + ++k));
      x = a.subtract(t);
      if (x.equals(ox)) {
        return x;
      }
    }
  }
}

