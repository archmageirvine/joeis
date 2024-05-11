package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A046490 Palindromes expressible as the sum of 2 consecutive palindromic primes.
 * @author Sean A. Irvine
 */
public class A046490 extends A002385 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z s = t.add(mA);
      if (Predicates.PALINDROME.is(s)) {
        return s;
      }
    }
  }
}
