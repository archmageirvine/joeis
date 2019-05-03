package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010006 Coordination sequence for <code>C_3</code> lattice: <code>a(n)=16*n^2+2 (n&gt;0), a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A010006 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(16).add(2);
  }
}
