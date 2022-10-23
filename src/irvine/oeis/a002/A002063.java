package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002063 a(n) = 9*4^n.
 * @author Sean A. Irvine
 */
public class A002063 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.shiftLeft(2);
    return mA;
  }
}

