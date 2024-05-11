package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046354 Composite palindromes whose sum of prime factors is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046354 extends A046352 {

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
