package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084404 Numbers n such that n#*2^n+1 is prime, where n# = product of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A084404 extends Sequence1 {

  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PRIME.is(++mN)) {
        mProd = mProd.multiply(mN);
      }
      mProd = mProd.multiply2();
      if (mProd.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
