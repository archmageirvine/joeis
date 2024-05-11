package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028570 Numbers k such that k*(k + 9) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028570 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.multiply(mN.add(9)))) {
        return mN;
      }
    }
  }
}
