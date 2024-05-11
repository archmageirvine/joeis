package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A046366 Composite numbers divisible by the palindromic sum of their palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046366 extends A046349 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z sopfr = Functions.SOPFR.z(t);
      if (Predicates.PALINDROME.is(sopfr) && t.mod(sopfr).isZero()) {
        return t;
      }
    }
  }
}
