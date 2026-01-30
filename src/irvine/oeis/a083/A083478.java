package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083478 a(n) is the smallest k &gt; 0 such that k*Palindrome(n)+1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A083478 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();

  @Override
  public Z next() {
    final Z p = mPalindromes.next();
    long k = 0;
    while (true) {
      if (Predicates.PALINDROME.is(p.multiply(++k).add(1))) {
        return Z.valueOf(k);
      }
    }
  }
}
