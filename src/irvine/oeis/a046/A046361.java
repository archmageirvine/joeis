package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A046361 Composite a(n) divided by the palindromic sum of its prime factors is a palindrome (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046361 extends A002808 {

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
