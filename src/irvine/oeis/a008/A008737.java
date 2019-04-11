package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008737 <code>a(n) =</code> floor(n/6)*ceiling(n/6).
 * @author Sean A. Irvine
 */
public class A008737 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(6).multiply(mN.add(5).divide(6));
  }
}


