package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046379 Palindromes with exactly 5 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046379 extends A046371 {

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
