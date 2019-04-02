package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005093 Sum of squares of Fibonacci numbers 1,2,3,5,... that divide n.
 * @author Sean A. Irvine
 */
public class A005093 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = Z.ZERO;
    final Sequence fibo = A005086.fibo();
    Z d;
    while ((d = fibo.next()).compareTo(mN) <= 0) {
      if (Z.ZERO.equals(mN.mod(d))) {
        s = s.add(d.square());
      }
    }
    return s;
  }
}

