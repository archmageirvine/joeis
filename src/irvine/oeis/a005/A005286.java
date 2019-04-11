package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005286 <code>a(n) = (n + 3)*(n^2 + 6*n + 2)/6</code>.
 * @author Sean A. Irvine
 */
public class A005286 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(mN.multiply(6).add(2)).multiply(mN.add(3)).divide(6);
  }
}

