package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005906 Truncated tetrahedral numbers: (1/6)*(n+1)*(23*n^2 + 19*n + 6).
 * @author Sean A. Irvine
 */
public class A005906 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(23).add(19).multiply(mN).add(6).multiply(mN.add(1)).divide(6);
  }
}
