package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005892 Truncated square numbers: <code>7*n^2 + 4*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A005892 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(7).add(4).multiply(mN).add(1);
  }
}
