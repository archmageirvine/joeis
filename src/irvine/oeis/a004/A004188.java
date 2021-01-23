package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004188 a(n) = n*(3*n^2 - 1)/2.
 * @author Sean A. Irvine
 */
public class A004188 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.square().multiply(3).subtract(1)).divide2();
  }
}
