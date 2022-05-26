package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A057225 Numbers n such that (Product of first n Mersenne prime exponents) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A057225 extends A000043 {

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
