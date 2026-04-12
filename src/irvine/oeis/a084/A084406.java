package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084406 Numbers k such that k#*2^k-1 is prime, where k# = product of primes &lt;= k.
 * @author Sean A. Irvine
 */
public class A084406 extends Sequence1 {

  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PRIME.is(++mN)) {
        mProd = mProd.multiply(mN);
      }
      mProd = mProd.multiply2();
      if (mProd.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
