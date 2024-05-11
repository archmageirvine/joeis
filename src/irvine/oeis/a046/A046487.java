package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046487 Palindromes k such that the sum of the first palindromes up to k is a palindrome.
 * @author Sean A. Irvine
 */
public class A046487 extends A002113 {

  private Z mSum = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      mSum = mSum.add(t);
      if (Predicates.PALINDROME.is(mSum)) {
        return t;
      }
    }
  }
}
