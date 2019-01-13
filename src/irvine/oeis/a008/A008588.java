package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008588.
 * @author Sean A. Irvine
 */
public class A008588 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN;
  }
}

