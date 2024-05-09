package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.a006.A006953;

/**
 * A185633 For odd n, a(n) = 2; for even n, a(n) = denominator of Bernoulli(n)/n; The number 2 alternating with the elements of A006953.
 * @author Georg Fischer
 */
public class A185633 extends A006953 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 1 ? Z.TWO : super.next();
  }
}
