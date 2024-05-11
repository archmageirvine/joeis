package irvine.oeis.a233;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A233007 Numbers k such that (k-1)^2 + k^2 + (k+1)^2 is a palindrome.
 * @author Georg Fischer
 */
public class A233007 extends Sequence1 {

  private Z mK = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (Predicates.PALINDROME.is(mK.subtract(1).square().add(mK.square()).add(mK.add(1).square()))) {
        return mK;
      }
    }
  }
}
