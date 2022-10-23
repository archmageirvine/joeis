package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004662 Powers of 3 written in base 8.
 * @author Sean A. Irvine
 */
public class A004662 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return new Z(mN.toString(8));
  }
}

