package irvine.oeis.a003;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003166 Numbers whose square in base 2 is a palindrome.
 * @author Sean A. Irvine
 */
public class A003166 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(2, mN.square())) {
        return mN;
      }
    }
  }
}
