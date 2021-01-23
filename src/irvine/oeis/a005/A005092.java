package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A005092 Sum of Fibonacci numbers 1,2,3,5,... that divide n.
 * @author Sean A. Irvine
 */
public class A005092 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = Z.ZERO;
    final Sequence fibo = new SkipSequence(new A000045(), 2);
    Z d;
    while ((d = fibo.next()).compareTo(mN) <= 0) {
      if (mN.mod(d).isZero()) {
        s = s.add(d);
      }
    }
    return s;
  }
}

