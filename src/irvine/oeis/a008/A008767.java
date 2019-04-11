package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008767 <code>a(n) =</code> floor(n/7)*ceiling(n/7).
 * @author Sean A. Irvine
 */
public class A008767 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(7).multiply(mN.add(6).divide(7));
  }
}


