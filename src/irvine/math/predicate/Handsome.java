package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is handsome.
 * @author Sean A. Irvine
 */
public class Handsome extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  private boolean is(final long base, final Z n, final Z s) {
    assert n.signum() >= 0;
    if (s.isZero()) {
      return n.isZero();
    }
    final Z[] qr = s.divideAndRemainder(base);
    final Z v = qr[1];
    if (v.compareTo(Z.ONE) <= 0) {
      return is(base, n.subtract(v), qr[0]);
    }
    Z u = v;
    while (u.compareTo(n) <= 0) {
      if (is(base, n.subtract(u), qr[0])) {
        return true;
      }
      u = u.multiply(v);
    }
    return false;
  }

  @Override
  public boolean is(final long base, final Z n) {
    return is(base, n, n);
  }
}


// A handsome number in base b (cf. A007532 for base 10) is an integer k such that k = Sum_{i=1..L} d_i^(e_i), where d_i are the digits of k in base b and each e_i >= 1 is an integer.
