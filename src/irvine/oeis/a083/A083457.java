package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083457 Smallest nontrivial k such that k^n - 1 is a palindrome (k &gt;1 for n&gt;1).
 * @author Sean A. Irvine
 */
public class A083457 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (Predicates.PALINDROME.is(Z.valueOf(++k).pow(mN).subtract(1))) {
        return Z.valueOf(k);
      }
    }
  }
}
