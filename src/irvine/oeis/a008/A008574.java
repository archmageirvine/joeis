package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008574.
 * @author Sean A. Irvine
 */
public class A008574 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(4);
    return Z.ONE.max(mN);
  }
}
