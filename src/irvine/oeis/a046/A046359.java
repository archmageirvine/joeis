package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071904;

/**
 * A046359 Odd numbers divisible by the palindromic sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046359 extends Sequence1 {

  private final Sequence mA = new A071904();

  @Override
  public Z next() {
    while (true) {
      final Z c = mA.next();
      final Z sopfr = Functions.SOPFR.z(c);
      if (Predicates.PALINDROME.is(sopfr) && c.mod(sopfr).isZero()) {
        return c;
      }
    }
  }
}
