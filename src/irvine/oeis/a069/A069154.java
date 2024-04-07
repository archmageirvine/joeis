package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069154 Treated as strings, the concatenation c of the prime factors of n, in increasing order, is an initial segment of n. Equivalently, n begins with c.
 * @author Sean A. Irvine
 */
public class A069154 extends A002808 {

  private boolean is(final Z n) {
    final String s = n.toString();
    int q = 0;
    for (final Z p : Jaguar.factor(n).toZArray()) {
      final String t = p.toString();
      if (!s.startsWith(t, q)) {
        return false;
      }
      q += t.length();
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}

