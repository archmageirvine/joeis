package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000422;

/**
 * A077183 Smallest number k such that the reverse concatenation of natural numbers from k to 1 is divisible by prime(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077183 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.equals(Z.TWO) || p.equals(Z.FIVE)) {
      return Z.ZERO;
    }
    final Sequence seq = new A000422();
    long k = 0;
    while (true) {
      ++k;
      final Z s = seq.next();
      if (s.mod(p).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

