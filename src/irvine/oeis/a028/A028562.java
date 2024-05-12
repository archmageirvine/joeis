package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028562 Palindromes of form k*(k+6).
 * @author Sean A. Irvine
 */
public class A028562 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(6));
      if (Predicates.PALINDROME.is(u)) {
        return u;
      }
    }
  }
}
