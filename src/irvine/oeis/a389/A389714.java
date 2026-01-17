package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A389714 Numbers k such that the product of the first k prime gaps minus 1 is prime.
 * @author Sean A. Irvine
 */
public class A389714 extends A001223 {

  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mProd = mProd.multiply(super.next());
      if (mProd.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

