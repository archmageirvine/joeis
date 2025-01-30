package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006420.
 * @author Sean A. Irvine
 */
public class A074812 extends Sequence1 {

  private long mN = 0;

  private boolean is(final Z n) {
    Z complement = Z.ZERO;
    Z m = Z.ONE;
    Z t = n;
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(Z.TEN);
      final long r = qr[1].longValue();
      if (r != 0) {
        complement = complement.add(m.multiply(10 - r));
      }
      m = m.multiply(10);
      t = qr[0];
    }
    return n.compareTo(complement) <= 0 && Predicates.SQUARE.is(complement);
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (s.mod(10) != 0 && is(s)) {
        return s;
      }
    }
  }
}
