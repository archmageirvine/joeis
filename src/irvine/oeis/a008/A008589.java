package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008589.
 * @author Sean A. Irvine
 */
public class A008589 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN;
  }
}

