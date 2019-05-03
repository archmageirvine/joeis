package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005914 Number of points on surface of hexagonal prism: <code>12n^2 + 2</code> for <code>n&gt;0 (coordination</code> sequence for <code>W(2))</code>.
 * @author Sean A. Irvine
 */
public class A005914 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(12).add(2);
  }
}
