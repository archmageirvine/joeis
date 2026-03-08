package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A084043 Smallest palindromic multiple of n in which the digit string of n appears as sandwiched between at least a pair of digits, or 0 if n = 10k or no such number exists.
 * @author Sean A. Irvine
 */
public class A084043 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    final String s = String.valueOf(mN);
    final Z min = Z.TEN.pow(s.length() + 1);
    final Sequence palindromes = new A002113();
    while (true) {
      final Z p = palindromes.next();
      if (p.compareTo(min) >= 0 && p.mod(mN) == 0) {
        final String ps = p.toString();
        final int i = ps.indexOf(s, 1);
        if (i > 0 && i + s.length() < ps.length()) {
          return p;
        }
      }
    }
  }
}

