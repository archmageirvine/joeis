package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008363 <code>a(n) =</code> floor(n/5)*ceiling(n/5).
 * @author Sean A. Irvine
 */
public class A008363 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(5).multiply(mN.add(4).divide(5));
  }
}


