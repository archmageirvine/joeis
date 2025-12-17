package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082615 Palindromes such that the GCD of any pair of successive terms is a palindromic prime.
 * @author Sean A. Irvine
 */
public class A082615 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalindromes.next();
      final Z d = Functions.GCD.z(mA, p);
      if (Predicates.PALINDROME.is(d) && d.isProbablePrime()) {
        mA = p;
        return p;
      }
    }
  }
}
