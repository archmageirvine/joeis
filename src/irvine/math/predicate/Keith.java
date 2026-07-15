package irvine.math.predicate;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * Test if a number is a Keith number.
 * @author Sean A. Irvine
 */
class Keith extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final String s = n.toString();
    final long[] coeffs = new long[s.length()];
    final long[] taps = new long[s.length()];
    Arrays.fill(taps, 1);
    for (int k = 0; k < s.length(); ++k) {
      coeffs[k] = s.charAt(k) - '0';
    }
    final Sequence seq = new LinearRecurrence(taps, coeffs);
    Z t;
    do {
      t = seq.next();
    } while (t.compareTo(n) < 0);
    return t.equals(n);
  }
}
