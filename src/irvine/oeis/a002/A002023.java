package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002023 a(n) = 6*4^n.
 * @author Sean A. Irvine
 */
public class A002023 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.shiftLeft(2);
    return mA;
  }
}
