package irvine.oeis.a006;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006029 Numbers k such that the k-th tetrahedral number k*(k+1)*(k+2)/6 is palindromic.
 * @author Sean A. Irvine
 */
public class A006029 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.multiply(mN.add(1)).multiply(mN.add(2)).divide(6);
      if (Predicates.PALINDROME.is(t)) {
        return mN;
      }
    }
  }
}

