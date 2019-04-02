package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004769 Numbers whose binary expansion ends in 011.
 * @author Sean A. Irvine
 */
public class A004769 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN;
  }
}

