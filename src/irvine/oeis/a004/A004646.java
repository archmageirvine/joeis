package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004646 Powers of 2 written in base 7.
 * @author Sean A. Irvine
 */
public class A004646 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return new Z(mN.toString(7));
  }
}

