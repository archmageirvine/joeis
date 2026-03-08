package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A084044 Smallest palindromic multiple of n in which n is a substring (anywhere), or 0 if n = 10k or no such number exists.
 * @author Sean A. Irvine
 */
public class A084044 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    final String s = String.valueOf(mN);
    final Sequence palindromes = new A002113();
    while (true) {
      final Z p = palindromes.next();
      if (p.mod(mN) == 0 && p.toString().contains(s)) {
        return p;
      }
    }
  }
}

