package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002066 a(n) = 10*4^n.
 * @author Sean A. Irvine
 */
public class A002066 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.shiftLeft(2);
    return mA;
  }
}

