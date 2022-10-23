package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034287 Numbers whose product of divisors is larger than that of any smaller number.
 * @author Sean A. Irvine
 */
public class A034287 extends Sequence1 {

  private Z mBestProd = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        prod = prod.multiply(d);
      }
      if (prod.compareTo(mBestProd) > 0) {
        mBestProd = prod;
        return Z.valueOf(mN);
      }
    }
  }
}

