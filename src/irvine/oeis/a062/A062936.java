package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062936 Numbers n such that n*R(n) is a palindrome, where R(n) (A004086) = digit reversal.
 * @author Sean A. Irvine
 */
public class A062936 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.PALINDROME.is(10, mN.multiply(Functions.REVERSE.z(mN)))) {
        return mN;
      }
    }
  }
}

