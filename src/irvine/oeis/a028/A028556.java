package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028556 Palindromes of form k*(k+4).
 * @author Sean A. Irvine
 */
public class A028556 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(4));
      if (Predicates.PALINDROME.is(u)) {
        return u;
      }
    }
  }
}
