package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008738 <code>a(n) = floor((n^2 + 1)/5)</code>.
 * @author Sean A. Irvine
 */
public class A008738 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1).divide(5);
  }
}


