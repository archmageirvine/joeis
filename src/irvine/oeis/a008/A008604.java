package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008604.
 * @author Sean A. Irvine
 */
public class A008604 implements Sequence {

  private Z mN = Z.valueOf(-22);

  @Override
  public Z next() {
    mN = mN.add(22);
    return mN;
  }
}

