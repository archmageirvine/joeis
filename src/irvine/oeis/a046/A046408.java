package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046408 Palindromes with exactly 2 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046408 extends A046400 {

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
