package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028555 Numbers k such that k*(k+4) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028555 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.multiply(mN.add(4)))) {
        return mN;
      }
    }
  }
}
