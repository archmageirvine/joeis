package irvine.oeis.a056;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056810 Numbers whose fourth power is a palindrome.
 * @author Georg Fischer
 */
public class A056810 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.pow(4))) {
        return mN;
      }
    }
  }
}
