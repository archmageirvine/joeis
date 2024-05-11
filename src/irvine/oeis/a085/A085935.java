package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A085935 Palindromes in A085934.
 * @author Georg Fischer
 */
public class A085935 extends A085934 {

  @Override
  public Z next() {
    while (true) {
      final Z mK = super.next();
      if (Predicates.PALINDROME.is(mK)) {
        return mK;
      }
    }
  }
}
