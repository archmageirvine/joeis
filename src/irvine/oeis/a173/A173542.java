package irvine.oeis.a173;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;

/**
 * A173542 Palindromic Ulam numbers.
 * @author Georg Fischer
 */
public class A173542 extends Sequence1 {

  private final A002858 mSeq = new A002858();

  @Override
  public Z next() {
    while (true) {
      final Z result = mSeq.next();
      if (Predicates.PALINDROME.is(10, result)) {
        return result;
      }
    }
  }
}
