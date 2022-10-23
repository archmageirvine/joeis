package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000212 a(n) = floor(n^2/3).
 * @author Sean A. Irvine
 */
public class A000212 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide(3);
  }
}

