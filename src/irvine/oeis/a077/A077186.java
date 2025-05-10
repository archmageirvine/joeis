package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a173.A173426;

/**
 * A077186 Smallest multiple of prime(n) of the form 123...(k-1) k (k-1)...321 ( a concatenation of natural numbers from 1 to k and back to 1), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077186 extends A000040 {

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
        return s;
      }
    }
  }
}

