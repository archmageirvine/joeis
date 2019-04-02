package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000466 a(n) = 4*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A000466 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().shiftLeft(2).subtract(1);
  }
}
