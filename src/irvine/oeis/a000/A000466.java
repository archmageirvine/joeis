package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000466 <code>a(n) = 4*n^2 - 1</code>.
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
