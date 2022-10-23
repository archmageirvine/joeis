package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002042 a(n) = 7*4^n.
 * @author Sean A. Irvine
 */
public class A002042 extends Sequence0 {

  private Z mA = Z.SEVEN;

  @Override
  public Z next() {
    final Z r = mA;
    mA = mA.shiftLeft(2);
    return r;
  }
}
