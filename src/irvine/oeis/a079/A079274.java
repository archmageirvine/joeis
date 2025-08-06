package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a074.A074141;

/**
 * A079274 Number of divisors associated with the cyclic cases within the n-th group of least prime signatures.
 * @author Sean A. Irvine
 */
public class A079274 extends A074141 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}

