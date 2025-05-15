package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000422;

/**
 * A077185 a(n) = A000422(A077183(n))/prime(n).
 * @author Sean A. Irvine
 */
public class A077185 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.equals(Z.TWO) || p.equals(Z.FIVE)) {
      return Z.ZERO;
    }
    final Sequence seq = new A000422();
    while (true) {
      final Z s = seq.next();
      if (s.mod(p).isZero()) {
        return s.divide(p);
      }
    }
  }
}

