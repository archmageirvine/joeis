package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A046358 Composite numbers divisible by the palindromic sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046358 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z sopfr = Functions.SOPFR.z(c);
      if (Predicates.PALINDROME.is(sopfr) && c.mod(sopfr).isZero()) {
        return c;
      }
    }
  }
}
