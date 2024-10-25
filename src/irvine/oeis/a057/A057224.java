package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A057224 Numbers k such that (Product of first k Mersenne prime exponents) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A057224 extends A000043 {

  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mProd = mProd.multiply(super.next());
      if (mProd.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
