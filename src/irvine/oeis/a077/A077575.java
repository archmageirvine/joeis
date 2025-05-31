package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002275;

/**
 * A077575 a(n) = A077573(n)/prime(n).
 * @author Sean A. Irvine
 */
public class A077575 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    if (++mN == 1 || mN == 3) {
      return Z.ZERO;
    }
    final Sequence repunit = new A002275().skip();
    while (true) {
      final Z r = repunit.next();
      if (r.mod(p).isZero()) {
        return r.divide(p);
      }
    }
  }
}
