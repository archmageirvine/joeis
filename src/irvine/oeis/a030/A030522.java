package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030522 Product of first n palindromic primes minus 1.
 * @author Sean A. Irvine
 */
public class A030522 extends A002385 {

  private Z mProduct = Z.ONE;

  @Override
  public Z next() {
    mProduct = mProduct.multiply(super.next());
    return mProduct.subtract(1);
  }
}
