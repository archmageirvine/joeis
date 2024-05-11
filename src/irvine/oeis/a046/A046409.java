package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046409 Palindromes with exactly 3 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046409 extends A046401 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
    }
  }
}
