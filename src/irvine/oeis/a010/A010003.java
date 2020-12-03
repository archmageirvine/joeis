package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010003 a(0) = 1, a(n) = 11*n^2 + 2 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A010003 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(11).add(2);
  }
}
