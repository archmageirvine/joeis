package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005585 5-dimensional pyramidal numbers: a(n) = n*(n+1)*(n+2)*(n+3)*(2n+3)/5!.
 * @author Sean A. Irvine
 */
public class A005585 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(3)).multiply(mN.multiply2().add(3)).divide(120);
  }
}

