package irvine.oeis.a002;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002780 Numbers whose cube is a palindrome.
 * @author Sean A. Irvine
 */
public class A002780 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.pow(3))) {
        return mN;
      }
    }
  }
}
