package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000982 a(n) = ceiling(n^2/2).
 * @author Sean A. Irvine
 */
public class A000982 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1).divide2();
  }
}

