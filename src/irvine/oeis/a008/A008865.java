package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008865 <code>a(n) = n^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A008865 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().subtract(2);
  }
}

