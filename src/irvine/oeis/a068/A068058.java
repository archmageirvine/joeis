package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a066.A066425;

/**
 * A068058 Zero-based position of the least significant (rightmost) zero bit in the bit-masks A068222 (A068224).
 * @author Sean A. Irvine
 */
public class A068058 extends A066425 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}

