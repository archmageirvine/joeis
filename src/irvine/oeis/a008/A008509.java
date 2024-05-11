package irvine.oeis.a008;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A008509 Positive integers k such that k-th triangular number is palindromic.
 * @author Sean A. Irvine
 */
public class A008509 extends A000217 {

  /** Construct the sequence. */
  public A008509() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

