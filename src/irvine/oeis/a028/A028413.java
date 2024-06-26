package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028413 Numbers k such that k^2 + k + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A028413 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.square().add(mN).add(1))) {
        return mN;
      }
    }
  }
}
