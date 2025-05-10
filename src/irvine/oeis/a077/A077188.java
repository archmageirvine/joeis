package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a173.A173426;

/**
 * A077188 a(n) = A077186(n)/prime(n).
 * @author Sean A. Irvine
 */
public class A077188 extends A000040 {

  // See A077187 for an implementation that would permit larger terms

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.equals(Z.TWO) || p.equals(Z.FIVE)) {
      return Z.ZERO;
    }
    final Sequence seq = new A173426();
    while (true) {
      final Z s = seq.next();
      if (s.mod(p).isZero()) {
        return s.divide(p);
      }
    }
  }
}

