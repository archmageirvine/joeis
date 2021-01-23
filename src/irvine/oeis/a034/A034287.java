package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034287 Numbers n such that product of divisors of n is larger than for any number less than n.
 * @author Sean A. Irvine
 */
public class A034287 implements Sequence {

  private Z mBestProd = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      for (final Z d : Cheetah.factor(++mN).divisors()) {
        prod = prod.multiply(d);
      }
      if (prod.compareTo(mBestProd) > 0) {
        mBestProd = prod;
        return Z.valueOf(mN);
      }
    }
  }
}

