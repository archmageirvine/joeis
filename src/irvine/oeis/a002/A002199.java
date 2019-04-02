package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a071.A071894;

/**
 * A002199 Least negative primitive root of n-th prime.
 * @author Sean A. Irvine
 */
public class A002199 extends A071894 {

  @Override
  public Z next() {
    final Z r = super.next();
    return mP.subtract(r);
  }
}
