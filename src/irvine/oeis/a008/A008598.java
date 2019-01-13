package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008598.
 * @author Sean A. Irvine
 */
public class A008598 implements Sequence {

  private Z mN = Z.valueOf(-16);

  @Override
  public Z next() {
    mN = mN.add(16);
    return mN;
  }
}

