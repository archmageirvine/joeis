package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002386;

/**
 * A053302 Largest n-digit prime at the start of a record in the RECORDS transform of the prime gaps.
 * @author Sean A. Irvine
 */
public class A053302 extends A002386 {

  private Z mA = Z.ONE;
  private Z mP = super.next();

  @Override
  public Z next() {
    mA = mA.multiply(10);
    Z res = mP;
    while (mP.compareTo(mA) < 0) {
      res = mP;
      mP = super.next();
    }
    return res;
  }
}

