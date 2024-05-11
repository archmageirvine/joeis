package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A085937 Palindromes in A085936.
 * @author Georg Fischer
 */
public class A085937 extends A085936 {

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
