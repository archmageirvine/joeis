package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a032.A032350;

/**
 * A046362 Composite palindromes divided by the palindromic sum of their prime factors is a palindrome (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046362 extends A032350 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z sopfr = Functions.SOPFR.z(c);
      if (Predicates.PALINDROME.is(sopfr)) {
        final Z[] qr = c.divideAndRemainder(sopfr);
        if (qr[1].isZero() && Predicates.PALINDROME.is(qr[0])) {
          return c;
        }
      }
    }
  }
}
