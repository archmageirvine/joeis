package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002413 Heptagonal <code>(or 7-gonal)</code> pyramidal numbers: <code>a(n) = n*(n+1)*(5*n-2)/6</code>.
 * @author Sean A. Irvine
 */
public class A002413 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.multiply(5).subtract(2)).divide(6);
  }
}
