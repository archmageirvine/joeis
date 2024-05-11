package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046378 Palindromes with exactly 4 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046378 extends A046370 {

  {
    setOffset(1);
  }

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
