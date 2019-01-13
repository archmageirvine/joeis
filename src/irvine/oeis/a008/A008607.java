package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008607.
 * @author Sean A. Irvine
 */
public class A008607 implements Sequence {

  private Z mN = Z.valueOf(-25);

  @Override
  public Z next() {
    mN = mN.add(25);
    return mN;
  }
}

