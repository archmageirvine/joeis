package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A062564 Palindromes which are the concatenation of 3 or more terms of an arithmetic sequence with nonzero difference.
 * @author Sean A. Irvine
 */
public class A062564 extends A002113 {

  private boolean is(final Z n, final Z a, final Z delta) {
    final Z t = a.add(delta);
    if (t.equals(n)) {
      return true;
    }
    if (t.signum() <= 0) {
      return false;
    }
    final String s = n.toString();
    final String u = t.toString();
    if (s.endsWith(u)) {
      return is(new Z(s.substring(0, s.length() - u.length())), t, delta);
    }
    return false;
  }

  private boolean is(final Z p) {
    Z ta = Z.TEN;
    while (ta.compareTo(p) < 0) {
      final Z[] qra = p.divideAndRemainder(ta);
      final Z a = qra[1]; // a is first number in progression
      final Z q = qra[0];
      Z tb = Z.TEN;
      while (tb.compareTo(q) < 0) {
        final Z[] qrb = q.divideAndRemainder(tb);
        final Z b = qrb[1]; // b is first number in progression
        final Z r = qrb[0];
        final Z delta = b.subtract(a);
        if (!delta.isZero() && is(r, b, delta)) {
          return true;
        }
        tb = tb.multiply(10);
      }
      ta = ta.multiply(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}

