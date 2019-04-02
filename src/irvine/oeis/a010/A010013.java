package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010013 a(0) = 1, a(n) = 23*n^2 + 2 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A010013 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(23).add(2);
  }
}
