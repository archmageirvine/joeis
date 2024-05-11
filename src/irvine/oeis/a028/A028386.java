package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028386 Numbers k such that k*(3k-1)/2 is a pentagonal palindrome.
 * @author Sean A. Irvine
 */
public class A028386 extends Sequence1 {

  private Z mN = Z.ZERO;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.multiply(mN.multiply(3).subtract(1)).divide2())) {
        return mN;
      }
    }
  }
}
