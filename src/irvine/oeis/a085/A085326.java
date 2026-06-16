package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A085326 a(n)=p is smallest prime such that rev(p)=n^j with some exponent, or 0 if no such prime exists [when e.g. n=1,n=3k or n=11k, k&gt;1].
 * @author Sean A. Irvine
 */
public class A085326 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    if (n == 1 || (n != 3 && n % 3 == 0) || (n != 11 && n % 11 == 0)) {
      return Z.ZERO;
    }
    if (n % 10 == 0) {
      return a(n / 10);
    }
    Z t = Z.valueOf(n);
    while (!Functions.REVERSE.z(t).isProbablePrime()) {
      t = t.multiply(n);
    }
    return Functions.REVERSE.z(t);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
