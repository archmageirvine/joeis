package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030094 Product of n with 666 is palindromic.
 * @author Sean A. Irvine
 */
public class A030094 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(mN.multiply(666))) {
        return mN;
      }
    }
  }
}
