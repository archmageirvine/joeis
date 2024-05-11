package irvine.oeis.a055;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A055391 Palindromic Lucas numbers.
 * @author Sean A. Irvine
 */
public class A055391 extends A000032 {

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
