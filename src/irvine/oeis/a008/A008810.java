package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008810 a(n) = ceiling(n^2/3).
 * @author Sean A. Irvine
 */
public class A008810 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(2).divide(3);
  }
}


