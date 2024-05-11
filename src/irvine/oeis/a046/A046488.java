package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046488 Palindromes that are the sum of the first n palindromes for some n.
 * @author Sean A. Irvine
 */
public class A046488 extends A046489 {

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
