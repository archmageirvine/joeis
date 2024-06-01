package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A070001 Palindromic integers &gt; 0, whose 'Reverse and Add!' trajectory (presumably) does not lead to another palindrome.
 * @author Sean A. Irvine
 */
public class A070001 extends A002113 {

  private static final int HEURISTIC = 1000; // same limit as OEIS

  private boolean is(Z t) {
    for (int k = 0; k < HEURISTIC; ++k) {
      t = Functions.REVERSE_AND_ADD.z(t);
      if (Predicates.PALINDROME.is(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (!s.isZero() && is(s)) {
        return s;
      }
    }
  }
}
