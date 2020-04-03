package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030521 Product of first n palindromic primes plus 1.
 * @author Sean A. Irvine
 */
public class A030521 extends A002385 {

  private Z mProduct = Z.ONE;

  @Override
  public Z next() {
    mProduct = mProduct.multiply(super.next());
    return mProduct.add(1);
  }
}
