package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A070954 Emirps which when concatenated with their reversals after a 0 make a palindromic prime of the form emirp0prime.
 * @author Sean A. Irvine
 */
public class A070954 extends A006567 {

  @Override
  public Z next() {
    while (true) {
      final Z emirp = super.next();
      final Z t = new Z(emirp + "0" + Functions.REVERSE.z(emirp));
      if (Predicates.PALINDROME.is(t) && t.isProbablePrime()) {
        return emirp;
      }
    }
  }
}
