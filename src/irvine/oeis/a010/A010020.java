package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010020 a(0) = 1, a(n) = 31*n^2 + 2 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A010020 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(31).add(2);
  }
}
