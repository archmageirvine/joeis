package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011842 <code>a(n) = floor(n(n-1)(n-2)/24)</code>.
 * @author Sean A. Irvine
 */
public class A011842 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.subtract(1)).multiply(mN.subtract(2)).divide(24);
  }
}

