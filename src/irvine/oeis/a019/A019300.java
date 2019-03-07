package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A019300.
 * @author Sean A. Irvine
 */
public class A019300 extends A010060 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.shiftLeft(1).add(super.next());
    return mA;
  }
}

