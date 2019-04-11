package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007590 <code>a(n) = floor(n^2/2)</code>.
 * @author Sean A. Irvine
 */
public class A007590 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide2();
  }
}
