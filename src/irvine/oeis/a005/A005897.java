package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005897 <code>a(n) = 6*n^2 + 2</code> for <code>n &gt; 0, a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A005897 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(6).add(2);
  }
}
