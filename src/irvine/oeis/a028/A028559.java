package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028559 Palindromes of the form k*(k+5).
 * @author Sean A. Irvine
 */
public class A028559 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(5));
      if (Predicates.PALINDROME.is(u)) {
        return u;
      }
    }
  }
}
