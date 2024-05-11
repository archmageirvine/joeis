package irvine.oeis.a045;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A045504 Palindromic Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A045504 extends A000045 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (Predicates.PALINDROME.is(f)) {
        return f;
      }
    }
  }
}
