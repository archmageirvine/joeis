package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010009 a(0) = 1, a(n) = 19*n^2 + 2 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A010009 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(19).add(2);
  }
}
