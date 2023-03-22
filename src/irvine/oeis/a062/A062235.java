package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A062235 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z p = mA;
    mA = super.next();
    return p.square().subtract(mA);
  }
}

