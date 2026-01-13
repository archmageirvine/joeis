package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083159 Palindromes n such that the n*m is also a palindrome, where m is the next palindrome after n.
 * @author Sean A. Irvine
 */
public class A083159 extends Sequence1 {

  private final Sequence mS = new A002113().skip();
  private Z mA = mS.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mS.next();
      if (Predicates.PALINDROME.is(t.multiply(mA))) {
        return t;
      }
    }
  }
}

