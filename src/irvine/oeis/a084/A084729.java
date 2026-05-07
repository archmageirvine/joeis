package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084729 Primes arising in A084728.
 * @author Sean A. Irvine
 */
public class A084729 extends Sequence1 {

  private long mN = 0;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      k += mN;
      final Z t = mProd.multiply(k);
      if (t.add(1).isProbablePrime()) {
        mProd = t;
        return t.add(1);
      }
    }
  }
}
