package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028337 Palindromes of the form n(n+1).
 * @author Sean A. Irvine
 */
public class A028337 extends Sequence1 {

  private Z mN = Z.ONE;
  
  @Override
  public Z next() {
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      final Z u = mN.multiply(t);
      if (Predicates.PALINDROME.is(u)) {
        return u;
      }
    }
  }
}
