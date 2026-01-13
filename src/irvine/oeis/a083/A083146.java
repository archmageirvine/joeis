package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083146 Smallest palindromic multiple of n-th palindrome which is not a concatenation of copies of that palindrome.
 * @author Sean A. Irvine
 */
public class A083146 extends Sequence1 {

  private final Sequence mS = new A002113().skip();

  private boolean ok(final Z p, final Z m) {
    if (!p.mod(m).isZero()) {
      return false;
    }
    final String s = p.toString();
    final String t = m.toString();
    if (s.length() % t.length() != 0) {
      return true;
    }
    if (!s.startsWith(t)) {
      return true;
    }
    return !t.repeat(s.length() / t.length()).equals(s);
  }

  @Override
  public Z next() {
    final Z m = mS.next();
    int len = Functions.DIGIT_LENGTH.i(m);
    while (true) {
      final Sequence palins = new LengthPalindromes(len);
      while (true) {
        final Z p = palins.next();
        if (p == null) {
          break;
        }
        if (p.compareTo(m) <= 0) {
          continue;
        }
        if (ok(p, m)) {
          return p;
        }
      }
      ++len;
    }
  }
}

