package irvine.oeis.a027;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027716 Numbers k such that k^2 + k + 4 is a palindrome.
 * @author Sean A. Irvine
 */
public class A027716 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.square().add(mN).add(4))) {
        return mN;
      }
    }
  }
}
