package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040081 Riesel problem: a(n) = smallest m &gt;= 0 such that n*2^m-1 is prime, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A040081 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    long m = 0;
    while (!n.subtract(1).isProbablePrime()) {
      n = n.multiply2();
      ++m;
    }
    return Z.valueOf(m);
  }
}
