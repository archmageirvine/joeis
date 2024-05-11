package irvine.oeis.a050;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050782 Smallest positive multiplier m such that m*n is palindromic (or zero if no such m exists).
 * @author Sean A. Irvine
 */
public class A050782 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    long k = 0;
    while (true) {
      if (Predicates.PALINDROME.is(n.multiply(++k))) {
        return Z.valueOf(k);
      }
    }
  }
}
