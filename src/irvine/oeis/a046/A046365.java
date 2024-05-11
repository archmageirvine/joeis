package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046365 Composite palindromes whose sum of prime factors is prime (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046365 extends A046363 {

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
