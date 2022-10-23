package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005581 a(n) = (n-1)*n*(n+4)/6.
 * @author Sean A. Irvine
 */
public class A005581 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.add(1);
    return t.multiply(mN).multiply(mN.add(4)).divide(6);
  }
}

