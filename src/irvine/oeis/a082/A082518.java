package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002385;

/**
 * A082518 Palindromic primes whose digital root equals their middle digits.
 * @author Sean A. Irvine
 */
public class A082518 extends Sequence1 {

  private final Sequence mPalinPrime = new A002385();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalinPrime.next();
      final int d = Functions.DIGIT_SUM_ROOT.i(p);
      final String s = p.toString();
      if (s.length() > 1 && s.charAt(s.length() / 2) - '0' == d) {
        return p;
      }
    }
  }
}
